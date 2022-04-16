package io.gitee.pchlgang.leetcode.p2;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/16 17:06
 * @description 列表节点
 * @since v1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
