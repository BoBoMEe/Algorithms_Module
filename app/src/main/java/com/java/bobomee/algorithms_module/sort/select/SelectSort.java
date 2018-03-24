/*
 *  Copyright (C) 2017.  BoBoMEe(wbwjx115@gmail.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.java.bobomee.algorithms_module.sort.select;

import com.java.bobomee.algorithms_module.Utils;

/**
 * @author BoBoMEe
 * @since 2017/4/12
 *
 *
 * 选择排序
 *
 * 改进了冒泡排序，将必要的交换次数从O(N²)减少到O(N)，但比较次数仍保持为 O(N²)。
 * 每次选择剩余元素中最小的，和已排序的数组的后面一个元素交换。
 *
 * 带排序的数据： 2， 1， 5， 4， 9
 * 第一次排序： 1， 2， 5， 4， 9
 * 第二次排序： 1， 2， 5， 4， 9
 * 第三次排序： 1， 2， 4， 5， 9
 * 第四次排序： 1， 2， 4， 5， 9
 *
 * 步骤：
 * （1）每次排序的时候都需要寻找第n小的数据，并且和array[n-1]发生交换
 * （2）等到n个数据都排序好，那么选择排序结束。
 *
 * 参考: <a href='http://blog.csdn.net/feixiaoxing/article/details/6874619'></a>
 *
 * 和冒泡排序的区别：在这个算法中有序的队员都排在队列的最左边（数组中较小的下标值），而冒泡排序则是优先排列在队列的右边。
 * 比较次数是主要的，所以结论是选择排序和冒泡排序一样 都是O(N²)的效率。
 */
public class SelectSort {
  /**
   * This method implements the Generic Selection Sort
   *
   * @param arr The array to be sorted
   * Sorts the array in increasing order
   **/

  public static <T extends Comparable<T>> void selectSort(T[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

      // Initial index of min
      int min = i;

      for (int j = i + 1; j < n; j++) {
        if (arr[j].compareTo(arr[min]) < 0) {
          min = j;
        }
      }

      // Swapping if index of min is changed
      if (min != i) {
        Utils.swap(arr,i,min);
      }
    }
  }

  public static void main(String[] args) {
    Integer a[] = { 20, 50, 20, 40, 70, 10, 80, 30, 60 };
    System.out.println("before sort:");
    Utils.print(a);

    selectSort(a);

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
