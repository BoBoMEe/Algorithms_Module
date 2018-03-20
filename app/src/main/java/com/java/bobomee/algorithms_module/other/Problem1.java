package com.java.bobomee.algorithms_module.other;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author BoBoMEe
 * @since 2018/3/20
 */

public class Problem1 {

  public static String fixString(String source){
    if (null == source || source.length() == 0)return source;

    Queue<String> queue = new ArrayDeque<>();
    char[] chars = source.toCharArray();
    for (char aChar : chars) {
      queue.add(String.valueOf(aChar));
    }

    StringBuilder stringBuilder = new StringBuilder();
    String lastS = null;
    String curS;
    int count = 1;

    while ((curS = queue.poll()) != null)
    {
      if (lastS != null){
        if (lastS.equals(curS)){
          count ++;
        }else {
          if (count >1)stringBuilder.append(count);
          stringBuilder.append(lastS);
          count =1;
        }
      }
      lastS = curS;
    }

    if (count >1) stringBuilder.append(count);
    stringBuilder.append(lastS);

    return stringBuilder.toString();

  }

  public static void main(String[] args){
    System.out.println(fixString("aaa"));
    System.out.println(fixString("aab"));
    System.out.println(fixString("abb"));
    System.out.println(fixString("aba"));
  }
}
