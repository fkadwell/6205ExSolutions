package Algorithms45.Ch_2_4;

import static Algorithms45.tools.ArrayGenerator.*;

import Algorithms45.edu.princeton.cs.algs4.StdOut;

/**
 * Created by HuGuodong on 2018/10/24.
 */

public class Ex_2_4_16 {

  public static int count;

  public static void sort(Comparable[] pq){
    int N = pq.length;
    for(int k=N/2; k>=1; k--){
      sink(pq,k,N);
    }
    while(N>1){
      exch(pq,1,N--);
      sink(pq,1,N);
    }
  }

  private static void sink(Comparable[] pq, int k, int n){
    while(2*k <=n){
      int j = 2*k;
      if(j<n && less(pq, j, j+1)) j++;
      if(!less(pq,k,j)) break;
      exch(pq,k,j);
      k=j;
    }
  }

  private static boolean less(Comparable[] pq, int i, int j){
    count++;
    return pq[i-1].compareTo(pq[j-1]) < 0;
  }

  private static void exch(Object[] pq, int i, int j){
    Object swap = pq[i-1];
    pq[i-1] = pq[j-1];
    pq[j-1] = swap;
  }

  private static void show(Comparable[] pq){
    for(int i=0; i<pq.length; i++){
      StdOut.print(pq[i] + " ");
    }
    StdOut.println();
  }


  public static void main(String[] args) {
    Integer[] arr = ascIntArray(32);


    StdOut.println(arr.length);
    show(arr);
    sort(arr);
    show(arr);
    StdOut.println("count: " + count);
    count = 0;

    arr = descIntArray(32);
    StdOut.println(arr.length);
    show(arr);
    sort(arr);
    show(arr);
    StdOut.println("count: " + count);
    count = 0;

    arr = fixedValueIntArray(1,32);
    // 31 for heap construction, 90 - 31 = 59
    StdOut.println(arr.length);
    show(arr);
    sort(arr);
    show(arr);
    StdOut.println("count: " + count);

    count = 0;
    arr = stringToIntArray("1 4 7 12 10 16 14 19 17 20 5 27 8 28 2 24 9 18 6 23 11 22 21 31 13 26 25 30 15 29 3 32");
    StdOut.println(arr.length);
    show(arr);
    sort(arr);
    show(arr);
    StdOut.println("count: " + count);

  }

}
