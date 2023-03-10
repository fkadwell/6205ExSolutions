package Algorithms45.Ch_1_2;

import Algorithms45.edu.princeton.cs.algs4.StdOut;
import Algorithms45.edu.princeton.cs.algs4.StdRandom;

/**
 * Created by HuGuodong on 2019/2/22.
 */

public class _Flips {

  public static void main(String[] args) {
    int trials = 1000000;
    _Counter heads = new _Counter("heads");
    _Counter tails = new _Counter("tails");
    for (int i = 0; i < trials; i++) {
      if (StdRandom.bernoulli(0.5)) {
        heads.increment();
      } else {
        tails.increment();
      }
    }
    StdOut.println(heads);
    StdOut.println(tails);
    int delta = heads.tally() - tails.tally();
    StdOut.println("delta: " + Math.abs(delta));
//    499677 heads
//    500323 tails
//    delta: 646
  }
}
