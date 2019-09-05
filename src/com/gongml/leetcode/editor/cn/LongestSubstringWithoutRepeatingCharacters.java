//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window

package com.gongml.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        Solution solution = longestSubstringWithoutRepeatingCharacters.new Solution();
        String aa = "aqqabcabcbb";
        int i = solution.lengthOfLongestSubstring(aa);
        System.out.println(i);

    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int ret = 0;
            int retTemp;
            int start = 0;
            int end = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0, j = 0; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(i, map.get(s.charAt(j)) + 1);
                }
                retTemp = j - i + 1;
                if (retTemp > ret) {
                    start = i;
                    end = j;
                    ret = retTemp;
                }
                map.put(s.charAt(j), j);

            }
            System.out.println(String.format("start:{%d},end:{%d}", start, end));
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

