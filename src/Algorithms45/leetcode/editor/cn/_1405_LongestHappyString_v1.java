//如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。 
//
// 给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串 s： 
//
// 
// s 是一个尽可能长的快乐字符串。 
// s 中 最多 有a 个字母 'a'、b 个字母 'b'、c 个字母 'c' 。 
// s 中只含有 'a'、'b' 、'c' 三种字母。 
// 
//
// 如果不存在这样的字符串 s ，请返回一个空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 输入：a = 1, b = 1, c = 7
//输出："ccaccbcc"
//解释："ccbccacc" 也是一种正确答案。
// 
//
// 示例 2： 
//
// 输入：a = 2, b = 2, c = 1
//输出："aabbc"
// 
//
// 示例 3： 
//
// 输入：a = 7, b = 1, c = 0
//输出："aabaa"
//解释：这是该测试用例的唯一正确答案。 
//
// 
//
// 提示： 
//
// 
// 0 <= a, b, c <= 100 
// a + b + c > 0 
// 
// Related Topics 贪心算法 动态规划


package Algorithms45.leetcode.editor.cn;

public class _1405_LongestHappyString_v1 {

  public static void main(String[] args) {
    Solution solution = new _1405_LongestHappyString_v1().new Solution();
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    String generate(int a, int b, int c, String aa, String bb, String cc) {
      if (a < b) return generate(b, a, c, bb, aa, cc);
      if (b < c) return generate(a, c, b, aa, cc, bb);
      if (b == 0) return aa.repeat(Math.min(2, a));
      int use_a = Math.min(2, a), use_b = a - use_a >= b ? 1 : 0;
      return aa.repeat(use_a) + bb.repeat(use_b) + generate(a - use_a, b - use_b, c, aa, bb, cc);
    }

    public String longestDiverseString(int a, int b, int c) {
      return generate(a, b, c, "a", "b", "c");
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}