package io.gitee.pchlgang.leetcode.p3;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/17 10:41
 * @description
 * @since v1.0
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.printf("暴力求解：%s字符串无重复字符的最长子串为：%d\n",s,BruteForceSolution.lengthOfLongestSubstring(s));
        System.out.printf("滑动窗口求解：%s字符串无重复字符的最长子串为：%d\n",s,SlidingWindowSolution.lengthOfLongestSubstring(s));
        s = "bbbbb";
        System.out.printf("暴力求解：%s字符串无重复字符的最长子串为：%d\n",s,BruteForceSolution.lengthOfLongestSubstring(s));
        System.out.printf("滑动窗口求解：%s字符串无重复字符的最长子串为：%d\n",s,SlidingWindowSolution.lengthOfLongestSubstring(s));
        s = "pwwkew";
        System.out.printf("暴力求解：%s字符串无重复字符的最长子串为：%d\n",s,BruteForceSolution.lengthOfLongestSubstring(s));
        System.out.printf("滑动窗口求解：%s字符串无重复字符的最长子串为：%d\n",s,SlidingWindowSolution.lengthOfLongestSubstring(s));
    }
}
