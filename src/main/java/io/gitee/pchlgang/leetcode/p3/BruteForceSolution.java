package io.gitee.pchlgang.leetcode.p3;

import java.util.HashSet;
import java.util.Set;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/17 10:22
 * @description 暴力求解法解决无重复字符的最长子串问题
 * @since v1.0
 */
public class BruteForceSolution {
    /**
     * 暴力破解法：从字符串第一个字符位置开始，依次寻找不存在重复字符的最大字符长度。使用HashSet辅助存储遍历的字符，最大字串字符长度ans = Math.max(ans, tempSet.size());
     * 时间复杂度：O(n^2)，双重for循环计算最长子串长度，时间复杂度高
     * 空间复杂度：O(n)，需要Set集合辅助存储子串，最长能达到s.length，因此空间复杂度与字符串的长度n相关
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        Set<Character> tempSet = new HashSet<>();
        int ans = 0;
        for (int i = 0;i < s.length();i++) {
            for(int j = i;j < s.length();j++) {
                if(!tempSet.contains(s.charAt(j))) {
                    tempSet.add(s.charAt(j));
                }else {
                    break;
                }
            }
            ans = Math.max(ans, tempSet.size());
            tempSet.clear();
        }
        return ans;
    }
}
