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

package com.java.bobomee.algorithms_module.sort.bubble;

import com.java.bobomee.algorithms_module.Utils;

/**
 * <pre/>
 * 算法描述：
 * 1. i从0开始，i与i+1比较，如果i&#62;i+1，那么就互换
 * 2. i不断增加，直到i&#60;n-1(n是数组元素的个数，n-1是数组已经最后一个元素) ，
 * 一趟下来，可以让数组元素中最大值排在数组的最后面
 *
 * <pre/>
 * 流程分析:
 * 1. 经过我们第一趟比较，最大的值排在末尾
 * 2. 第二趟排序完了之后，倒数第二位也是第二大的数了，且不需要比较最后一位了（已经是最大）
 *
 * <pre/>
 * 最好的时间复杂度为：O(n)
 * 最坏时间复杂度为：O(<i>n</i><sup>{@code 2}</sup>)
 * 平均时间复杂度为：O(<i>n</i><sup>{@code 2}</sup>)
 *
 * @author BoBoMEe
 * @since 2017/4/5
 */
public final class BubbleSort {

  /**
   * This method implements the Generic Bubble Sort
   *
   * @param array The array to be sorted
   * Sorts the array in increasing order
   **/

  public static <T extends Comparable<T>> void bubbleSort(T array[]) {
    int last = array.length;
    boolean swap;
    do {
      swap = false;
      for (int count = 0; count < last - 1; count++) {
        T current = array[count];
        T next = array[count + 1];
        int comp = current.compareTo(next);
        if (comp > 0) {
          Utils.swap(array, count, count + 1);
          swap = true;
        }
      }
      last--;
    } while (swap);
  }

  public static void main(String[] args) {
    Integer[] a = { 20, 40, 30, 10, 60, 50 };

    System.out.println("before sort:");
    Utils.print(a);

    bubbleSort(a);

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
