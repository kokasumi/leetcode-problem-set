package io.gitee.pchlgang.leetcode.p1;

import java.util.Arrays;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/15 9:11
 * @description
 * @since v1.0
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.printf("nums: %s, target: %d, 数组枚举方式计算结果: %s\n", Arrays.toString(nums),
                target, Arrays.toString(BruteForceEnumeration.twoSum(nums, target)));
        System.out.printf("nums: %s, target: %d, 哈希表方式计算结果: %s\n", Arrays.toString(nums),
                target, Arrays.toString(HashTableSolution.twoSum(nums, target)));
    }
}
