package io.gitee.pchlgang.leetcode.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/17 10:51
 * @description 滑动窗口解决思路
 * @since v1.0
 */
public class SlidingWindowSolution {
    /**
     * 滑动窗口解决思路：
     * (1)定义一个Map数据结构存储(k,v)，其中k值为字符，v值为字符所在位置+1，用于从重复字符后一位再次进行查找
     * (2)定义不重复子串开始位置为start，结束位置为end
     * (3)随着end不断向后遍历，会遇到与[start,end]区间字符相同的情况，此时将字符作为key值获取其在map中value值，并更新start后[start,end]区间不存在重复字符，
     * 继续遍历过程直至end>=s.length
     * (4)无论是否更新start位置，都需要更新map数据结构和结果ans，ans=Math.max(ans, end - start + 1);
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for (int start = 0,end = 0;end < s.length();end++) {
            char alpha = s.charAt(end);
            if(map.containsKey(alpha)) {
                start = Math.max(start, map.get(alpha));
            }
            ans = Math.max(ans, end - start + 1);
            map.put(alpha,end + 1);
        }
        return ans;
    }
}
