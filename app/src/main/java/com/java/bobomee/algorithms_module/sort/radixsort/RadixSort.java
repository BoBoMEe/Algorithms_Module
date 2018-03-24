package com.java.bobomee.algorithms_module.sort.radixsort;

import com.java.bobomee.algorithms_module.Utils;

/**
 * @author BoBoMEe
 */

public class RadixSort {

  private static void radixSort(int[] a) {
    int i, m = a[0], exp = 1, n = a.length;
    int[] b = new int[10];

    for (i = 1; i < n; i++)
      if (a[i] > m) m = a[i];

    while (m / exp > 0) {
      int[] bucket = new int[10];

      for (i = 0; i < n; i++)
        bucket[(a[i] / exp) % 10]++;
      for (i = 1; i < 10; i++)
        bucket[i] += bucket[i - 1];
      for (i = n - 1; i >= 0; i--)
        b[--bucket[(a[i] / exp) % 10]] = a[i];
      for (i = 0; i < n; i++)
        a[i] = b[i];
      exp *= 10;
    }
  }

  public static void main(String[] args) {
    int a[] = { 20, 50, 20, 40, 70, 10, 80, 30, 60 };
    System.out.println("before sort:");
    Utils.print(a);

    radixSort(a);

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
