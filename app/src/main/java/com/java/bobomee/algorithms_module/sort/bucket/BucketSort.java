package com.java.bobomee.algorithms_module.sort.bucket;

import com.java.bobomee.algorithms_module.Utils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Project ID：400YF17051<br/>
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @since 2017/7/24 汪波 first commit
 */
public class BucketSort {

  public static int[] bucketSort(int[] arr) {
    int i, j;
    int[] bucket = new int[arr.length+1];
    Arrays.fill(bucket, 0);

    for (i = 0; i < arr.length; i++) {
      bucket[arr[i]]++;
    }

    int k=0;
    for (i = 0; i < bucket.length; i++) {
      for (j = 0; j<bucket[i]; j++) {
        arr[k++] = i;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int a[] = { 8, 2, 3, 4, 3, 6, 6, 3, 9 };

    System.out.println("before sort:");
    Utils.print(a);

    bucketSort(a); // 桶排序

    System.out.println("after  sort:");
    Utils.print(a);
  }
}
