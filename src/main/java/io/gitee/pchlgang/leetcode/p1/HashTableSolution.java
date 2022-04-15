package io.gitee.pchlgang.leetcode.p1;

import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/15 9:24
 * @description 哈希表方法解决两数之和问题
 * @since v1.0
 */
public class HashTableSolution {
    /**
     * 枚举数组中的每一个元素x，寻找哈希表中是否存在元素y=target-x，如果不存在，则将当前元素值x及所在位置记录到哈希表中；
     * 如果存在,则返回当前元素x所在位置及哈希表中查找到的元素y所在位置
     * 时间复杂度：O(N)，其中N是数组中的元素数量。对于每一个元素x，我们在哈希表中以O(1)时间复杂度寻找target-x。
     * 空间复杂度：O(N)，其中N是数组中的元素数量。主要为哈希表的开销。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> hashtable = new HashMap<>();
        for (int i = 0;i < nums.length;i++) {
            if(hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
