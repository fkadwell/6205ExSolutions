package Algorithms45.Ch_1_4;

import Algorithms45.edu.princeton.cs.algs4.In;
import Algorithms45.edu.princeton.cs.algs4.StdIn;
import Algorithms45.edu.princeton.cs.algs4.StdOut;
import Algorithms45.tools.PrintUtil;

/**
 * Created by HuGuodong on 2019/8/6.
 */

public class _ThreeSum {

  public static int count(int[] a) {
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        for (int k = j + 1; k < N; k++) {
          if (a[i] + a[j] + a[k] == 0) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    // input 1Kints.txt
    String file = "";
    while (!StdIn.isEmpty()) {
      file = StdIn.readString();
    }
    int[] a = new In(file).readAllInts();
    StdOut.println(count(a));
  }
}
