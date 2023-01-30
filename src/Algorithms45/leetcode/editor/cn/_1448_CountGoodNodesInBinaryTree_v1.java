//给你一棵根为 root 的二叉树，请你返回二叉树中好节点的数目。 
//
// 「好节点」X 定义为：从根到该节点 X 所经过的节点中，没有任何节点的值大于 X 的值。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：root = [3,1,4,3,null,1,5]
//输出：4
//解释：图中蓝色节点为好节点。
//根节点 (3) 永远是个好节点。
//节点 4 -> (3,4) 是路径中的最大值。
//节点 5 -> (3,4,5) 是路径中的最大值。
//节点 3 -> (3,1,3) 是路径中的最大值。 
//
// 示例 2： 
//
// 
//
// 输入：root = [3,3,null,4,2]
//输出：3
//解释：节点 2 -> (3, 3, 2) 不是好节点，因为 "3" 比它大。 
//
// 示例 3： 
//
// 输入：root = [1]
//输出：1
//解释：根节点是好节点。 
//
// 
//
// 提示： 
//
// 
// 二叉树中节点数目范围是 [1, 10^5] 。 
// 每个节点权值的范围是 [-10^4, 10^4] 。 
// 
// Related Topics 树 深度优先搜索


package Algorithms45.leetcode.editor.cn;

public class _1448_CountGoodNodesInBinaryTree_v1 {

  public static void main(String[] args) {
    Solution solution = new _1448_CountGoodNodesInBinaryTree_v1().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
   * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
   * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
   */
  class Solution {

    public int goodNodes(TreeNode root) {
      return f(root, Integer.MIN_VALUE);
    }

    private int f(TreeNode node, int max) {
      if (node == null) return 0;
      max = Math.max(node.val, max);
      int left = f(node.left, max);
      int right = f(node.right, max);
      return (max == node.val ? 1 : 0) + left + right;
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}