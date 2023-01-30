package Algorithms45.Ch_1_1;

import Algorithms45.edu.princeton.cs.algs4.StdDraw;
import Algorithms45.edu.princeton.cs.algs4.StdOut;
//import org.junit.Test;

/**
 * Created by HuGuodong on 2019/2/17.
 */

public class TestStdDraw_FunctionValues {

  public static void main(String[] args) {
    int N = 100;
    StdDraw.setXscale(0, N);
    StdDraw.setYscale(0, N*N);
    StdDraw.setPenRadius(.01);
    for (int i = 1; i <= N; i++) {
      StdDraw.point(i, i);
      StdDraw.point(i, i*i);
      StdDraw.point(i, i*Math.log(i));
    }
  }

}
