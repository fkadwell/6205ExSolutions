//给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。 
//
// 示例 1: 
//
// 输入: 2
//输出: [0,1,1] 
//
// 示例 2: 
//
// 输入: 5
//输出: [0,1,1,2,1,2] 
//
// 进阶: 
//
// 
// 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？ 
// 要求算法的空间复杂度为O(n)。 
// 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。 
// 
// Related Topics 位运算 动态规划

package Algorithms45.leetcode.editor.cn;

import Algorithms45.tools.PrintUtil;

public class _0338_CountingBits_dp {

  /**
   * 0 = (0000) 1 = (0001) 2 = (0010) 3 = (0011) 4 = (0100) 5 = (0101) 6 = (0110) 7 = (0111) 8 =
   * (1000) 9 = (1001) 10 = (1010)
   *
   * @param args
   */
  public static void main(String[] args) {
    Solution solution = new _0338_CountingBits_dp().new Solution();
//        solution.countBits(10);
    System.out.println(7 & (7 - 1));
    PrintUtil.show(solution.countBits(10));
  }


  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {


    public int[] countBits(int num) {
      int[] res = new int[num + 1];
      for (int i = 1; i <= num; i++) {  //注意要从1开始，0不满足
        System.out.println(i & (i - 1));
        res[i] = res[i & (i - 1)] + 1;

      }
      return res;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}