package com.java.bobomee.algorithms_module.sort.countingsort;

import com.java.bobomee.algorithms_module.Utils;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author BoBoMEe
 */

public class CountingSort {
  /**
   * This method implements the Generic Counting Sort
   *
   * @param array The array to be sorted
   * It uses array elements as keys in the frequency map
   **/

  public static <T extends Comparable<T>> void countSort(T[] array) {

    Map<T, Integer> frequency = new TreeMap<T, Integer>();
    // The final output array
    ArrayList<T> sortedArray = new ArrayList<T>();

    // Counting the frequency of @param array elements
    for (T t : array) {
      try {
        frequency.put(t, frequency.get(t) + 1);
      } catch (Exception e) { // new entry
        frequency.put(t, 1);
      }
    }

    // Filling the sortedArray
    for (Map.Entry<T, Integer> element : frequency.entrySet()) {
      for (int j = 0; j < element.getValue(); j++)
        sortedArray.add(element.getKey());
    }

    for (int i = 0; i < array.length; i++) {
      array[i] = sortedArray.get(i);
    }
  }

  public static void main(String[] args) {
    Integer a[] = { 20, 50, 20, 40, 70, 10, 80, 30, 60 };
    System.out.println("before sort:");
    Utils.print(a);

    countSort(a);

    System.out.println("after  sort:");
    Utils.print(a);
  }
}

