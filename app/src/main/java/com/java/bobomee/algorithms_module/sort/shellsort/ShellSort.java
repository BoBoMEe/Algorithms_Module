package com.java.bobomee.algorithms_module.sort.shellsort;

import com.java.bobomee.algorithms_module.Utils;

/**
 * @author BoBoMEe
 */

public class ShellSort {
  /**
   * This method implements Generic Shell Sort.
   *
   * @param array The array to be sorted
   */
  public static void shellSort(Comparable[] array) {
    int N = array.length;
    int h = 1;

    while (h < N / 3) {
      h = 3 * h + 1;
    }

    while (h >= 1) {
      for (int i = h; i < N; i++) {
        for (int j = i; j >= h && array[j].compareTo(array[j - h]) < 0; j -= h) {
          Utils.swap(array, j, j - h);
        }
      }

      h /= 3;
    }
  }

  public static void main(String[] args) {
    Integer a[] = { 20, 50, 20, 40, 70, 10, 80, 30, 60 };
    System.out.println("before sort:");
    Utils.print(a);

    shellSort(a);

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
