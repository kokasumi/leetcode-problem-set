package io.gitee.pchlgang.leetcode.p1;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/14 19:09
 * @description 暴力枚举方法解决两数之和问题
 * @since v1.0
 */
public class BruteForceEnumeration {
    /**
     * 使用双重for循环依次枚举计算两数之和，如果两数之和为target，则找到对应位置
     * 时间复杂度：O(N^2)，其中N是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
     * 空间复杂度：O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target) {
        for (int i = 0;i < nums.length;i++) {
            for (int j = i + 1;j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
