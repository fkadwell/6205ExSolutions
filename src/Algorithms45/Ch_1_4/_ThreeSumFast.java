package Algorithms45.Ch_1_4;

import Algorithms45.edu.princeton.cs.algs4.BinarySearch;
import Algorithms45.edu.princeton.cs.algs4.In;
import Algorithms45.edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

/**
 * Created by HuGuodong on 2019/8/10.
 */

public class _ThreeSumFast {

  public static int count(int[] a) {
    Arrays.sort(a);
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (BinarySearch.indexOf(a, -a[i] - a[j]) > j) {
          cnt++;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    String file = "1Kints.txt";
    int[] a = new In(file).readAllInts();
    StdOut.println("count : " + count(a));
  }
}
