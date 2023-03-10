package Algorithms45.geekbang.ALGO.u10;

import Algorithms45.edu.princeton.cs.algs4.StdOut;
import Algorithms45.edu.princeton.cs.algs4.Stopwatch;
//import org.junit.Test;
import Algorithms45.tools.ArrayGenerator;
import Algorithms45.tools.PrintUtil;

/**
 * Created by HuGuodong on 2019/3/4.
 */

public class U12Sort {

  public static class Sort {

    public static void bubbleSort(int[] a) {
      if (a == null || a.length == 0) {
        throw new IllegalArgumentException("array is null or no element!");
      }
      int n = a.length;
      for (int i = 0; i < n; i++) {
        boolean flag = false; // 提前退出冒泡循环的标志位
        for (int j = 0; j < n - 1 - i; j++) {
          if (a[j] > a[j + 1]) {
            exch(a, j, j + 1);
            flag = true; // 表示有数据交换
          }
        }
        if (!flag) {
          break; // 没有数据交换，提前退出。
        }
      }
    }

    public static void InsertionSort(int[] a) {
      if (a == null || a.length == 0) {
        throw new IllegalArgumentException("array is null or no element!");
      }
      int n = a.length;
      for (int i = 1; i < n; i++) { // 无序数组部分
        int temp = a[i];
        int j;
        for (j = i - 1; j >= 0; j--) { // 有序数组部分
          if (temp < a[j]) {
            a[j + 1] = a[j];
          } else {
            break;
          }
        }
        a[j + 1] = temp; // 因为j--，位置差一
      }
    }
  }


  public static void InsertionSort(int[] a) {
    if (a == null || a.length == 0) {
      throw new IllegalArgumentException("array is null or no element!");
    }
    int n = a.length;
    for (int i = 1; i < n; i++) { // 无序数组部分
      int temp = a[i];
      int j;
      for (j = i - 1; j >= 0; j--) { // 有序数组部分
        if (temp < a[j]) {
          a[j + 1] = a[j];
        } else {
          break;
        }
      }
      a[j + 1] = temp; // 因为j--，位置差一
    }
  }

  //@Test
  public void testSortCompare(){
    int[] a;
    Stopwatch time = new Stopwatch();
    int N = 10000;
    for (int i = 0; i < N; i++) {
      a = ArrayGenerator.randomIntsArray(200);
      Sort.InsertionSort(a);
//      PrintUtil.show(a);
    }
    StdOut.println(time.elapsedTime());

    time = new Stopwatch();
    for (int i = 0; i < N; i++) {
      a = ArrayGenerator.randomIntsArray(200);
      Sort.bubbleSort(a);
//      PrintUtil.show(a);
    }
    StdOut.println(time.elapsedTime());
  }

  public static void exch(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }


  public static void main(String[] args) {

//    int[] a = ArrayGenerator.randomIntsArray(1, 10);
    int[] a = {6, 2, 3, 5, 4, 1};
    PrintUtil.show(a);
//    Sort.bubbleSort(a);
    Sort.InsertionSort(a);
    PrintUtil.show(a);

  }

}
