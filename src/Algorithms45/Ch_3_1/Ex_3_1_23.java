package Algorithms45.Ch_3_1;

import static Algorithms45.tools.ArrayGenerator.ascInts;

import Algorithms45.edu.princeton.cs.algs4.StdOut;

/**
 * Created by HuGuodong on 2018/11/21.
 */

public class Ex_3_1_23 {

  public static int compareTimes = 0;

  public static int binarySearch(int[] a, int k) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi-lo)/2;
      int cmp = compare(k, a[mid]);
      if (cmp == 0) {
        return mid;
      } else if (cmp < 0) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return -1;
  }

  private static int compare(int a, int b) {
    compareTimes++;
    return a - b;
  }

  public static void main(String[] args) {
    int N = 1024;
    int[] a = ascInts(0, N - 1);
    int index = binarySearch(a, 1025);
    int n = Integer.toBinaryString(N).length();
    StdOut.println("N:" + Integer.toBinaryString(N));
    StdOut.printf("b: %d, compares :%d, N: %d", index, compareTimes, n);
  }
}
