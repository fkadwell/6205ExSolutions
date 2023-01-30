package Algorithms45.geekbang.ALGO.u40;

import Algorithms45.tools.ArrayGenerator;
import Algorithms45.tools.PrintUtil;

/**
 * Created by HuGuodong on 2019/10/30.
 */
public class PackDPv5 {

  public static void print(int[] a) {
    int n = a.length;
    for (int i = 1; i <= 4; i++) {
      for (int j = (int) Math.pow(2, i - 1); j < (int) Math.pow(2, i); j++) {
        System.out.printf("%2d ", j);
      }
      System.out.println();
    }
  }

  public static void f(int[] a, int n) {
    int[][] states = new int[n][n];
    states[0][a[1]] = a[1];
    for (int i = 2; i <= 4; i++) {
      for (int j = (int) Math.pow(2, i - 1); j < (int) Math.pow(2, i); j++) {

      }
    }
  }

  public static void main(String[] args) {
    int[] a = ArrayGenerator.ascInts(16);
    PrintUtil.show(a);
    print(a);
  }
}
