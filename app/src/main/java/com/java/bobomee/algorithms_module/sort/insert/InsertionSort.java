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

package com.java.bobomee.algorithms_module.sort.insert;

import com.java.bobomee.algorithms_module.Utils;

/**
 * Resume: 插入排序
 * 时间复杂度仍然为 O(N²)
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/4/5 汪波 first commit
 *
 * 大多数情况下，插入排序比冒泡排序，选择排序要好的多
 * 虽然插入排序仍然需要O(N²)的时间
 *
 * 1. 一般的情况下，它要比冒泡排序快一倍，比选择和冒泡要更快一些
 * 2. 经常被用在教复杂的排序算法的最后阶段，例如快速排序
 * 3. 对于基本有序的文件进行排序，只需要O（N）的时间
 * 4. 对于逆序排列的数据，插入排序 并不比冒泡排序快。
 */
public class InsertionSort {

  /**
   * This method implements the Generic Insertion Sort
   *
   * @param array The array to be sorted
   * Sorts the array in increasing order
   **/

  public static <T extends Comparable<T>> void insertSort(T array[]) {
    T key;
    int last = array.length;
    for (int j = 1; j < last; j++) {

      // Picking up the key(Card)
      key = array[j];
      int i = j - 1;
      while (i >= 0 && key.compareTo(array[i]) < 0) {
        array[i + 1] = array[i];
        i--;
      }
      // Placing the key (Card) at its correct position in the sorted subarray
      array[i + 1] = key;
    }
  }

  public static void main(String[] args) {
    Integer a[] = { 20, 50, 20, 40, 70, 10, 80, 30, 60 };
    System.out.println("before sort:");
    Utils.print(a);

    insertSort(a); // 桶排序

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
