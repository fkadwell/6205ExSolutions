package Algorithms45.Ch_1_1;

import Algorithms45.edu.princeton.cs.algs4.StdIn;
import Algorithms45.edu.princeton.cs.algs4.StdOut;

/**
 * Created by HuGuodong on 2019/2/17.
 */

public class Ex_1_1_05 {

  public static void main(String[] args) {
//    1.1.5 Write a code fragment that prints true if the double variables x and y are both strictly between 0 and 1 and false otherwise.

    double num1 = StdIn.readDouble();
    double num2 = StdIn.readDouble();

    if( (num1>0 && num1 <1) && (num2>0 && num2 <1) )
      StdOut.println(true);
    else
      StdOut.println(false);

//    0
//    1
//    false

//    0.99999
//    0.00001
//    true
  }
}
