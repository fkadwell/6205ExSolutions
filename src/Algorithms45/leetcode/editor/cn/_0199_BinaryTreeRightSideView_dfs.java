//给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。 
//
// 示例: 
//
// 输入: [1,2,3,null,5,null,4]
//输出: [1, 3, 4]
//解释:
//
//   1            <---
// /   \
//2     3         <---
// \     \
//  5     4       <---
// 
// Related Topics 树 深度优先搜索 广度优先搜索


package Algorithms45.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class _0199_BinaryTreeRightSideView_dfs {

  public static void main(String[] args) {
    Solution solution = new _0199_BinaryTreeRightSideView_dfs().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
   * right; TreeNode(int x) { val = x; } }
   */
  class Solution {

    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
      dfs(root, 0);
      return res;
    }

    private void dfs(TreeNode node, int level) {
      if (node == null) return;
      if (level == res.size()) {
        res.add(node.val);
      }
      dfs(node.right, level + 1);
      dfs(node.left, level + 1);
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}