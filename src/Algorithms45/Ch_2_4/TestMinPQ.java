package Algorithms45.Ch_2_4;

import Algorithms45.edu.princeton.cs.algs4.MinPQ;

/**
 * Created by HuGuodong on 2018/10/23.
 */

public class TestMinPQ {

  public static void main(String[] args) {
    MinPQ<Integer> pq = new MinPQ<>();
    for(int i=0; i<10; i++){
      pq.insert(i);
    }

    System.out.println(pq.isMinHeap());
    System.out.println(MinPQ.count);
  }

}
