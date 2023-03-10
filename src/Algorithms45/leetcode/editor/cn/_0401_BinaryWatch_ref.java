//二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。 
//
// 每个 LED 代表一个 0 或 1，最低位在右侧。 
//
// 
//
// 例如，上面的二进制手表读取 “3:25”。 
//
// 给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。 
//
// 案例: 
//
// 
//输入: n = 1
//返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "
//0:32"] 
//
// 
//
// 注意事项: 
//
// 
// 输出的顺序没有要求。 
// 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。 
// 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。 
// 
// Related Topics 位运算 回溯算法


package Algorithms45.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class _0401_BinaryWatch_ref {

  public static void main(String[] args) {
    Solution solution = new _0401_BinaryWatch_ref().new Solution();
    solution.readBinaryWatch(3);
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public List<String> readBinaryWatch(int num) {
      List<String> res = new ArrayList<>();
      helper(res, new boolean[10], 0, num);
      return res;
    }

    void helper(List<String> res, boolean[] choose, int start, int k) {
      if (k > 8) return;
      if (k == 0) {
        //(10 choose num) is done, check if time is valid
        int[] cache = new int[]{8, 4, 2, 1, 32, 16, 8, 4, 2, 1};
        int hh = 0, mm = 0;
        for (int i = 0; i < 10; i++) {
          if (choose[i]) {
            if (i < 4) hh += cache[i];
            else mm += cache[i];
          }
        }
        if (hh < 12 && mm < 60) {
          if (mm < 10) res.add("" + hh + ":0" + mm);
          else res.add("" + hh + ":" + mm);
        }
      }
      else {
        for (int i = start; i < choose.length - k + 1; i++) {
          choose[i] = true;
          helper(res, choose, i + 1, k - 1);
          choose[i] = false;
        }
      }
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}