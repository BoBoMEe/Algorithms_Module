package com.java.bobomee.algorithms_module.other;

/**
 * @author BoBoMEe
 * @since 2018/3/20
 */

public class Problem2 {

  public static int index(String longs, String shortS) {
    int result = -1;
    if (null == longs || null == shortS) return result;
    int longLength = longs.length();
    int shortLength = shortS.length();
    if (0 == longLength || 0 == shortLength || longLength < shortLength) return result;

    for (int i = 0; i < longLength; i++) {

      int j = 0;
      int k = i;

      while (j < shortLength && longs.charAt(k) == shortS.charAt(j)) {
        k++;
        j++;
      }

      if (j == shortLength) {
        return k - shortLength;
      }
    }

    return result;
  }

  public static void main(String[] args) {

    System.out.println(index("abacdfhab", "df"));
    System.out.println(index("abacdfhab", "d"));
    System.out.println(index("abacdfhab", "dh"));
    System.out.println(index("abacdfhab", ""));
  }
}
