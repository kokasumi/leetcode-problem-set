package io.gitee.pchlgang.leetcode.p2;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/16 17:06
 * @description 两数相加解决思路
 * @since v1.0
 */
public class TwoSumAddSolution {
    /**
     * (1)两个数按逆序存储到链表中，每个节点只存储一个数字
     * (2)按照两数相加计算规则，两个链表中同一位置的数字可以直接相加
     * (3)遍历两个链表，将相同位置数字直接相加，并与当前位置的进位值相加得到的结果sum，那么sum%10即为当前位计算结果，carry=sum/10为下一位进位值
     * (4)两个链表长度不同，可以认为长度短的链表后面都是以0参与计算
     * (5)如果链表遍历结束后，carry>0，还需要在结果链表中加一个节点，节点值为carry，表示最后一个进位
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        ListNode head = null, tail = null;
        // 当前位进位值
        int carry = 0;
        while (l1 != null || l2 != null) {
            // 短链表以0参与计算
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            // 当前位计算结果sum = 链表1当前值 + 链表2当前值 + 前一位计算进位值
            int sum = val1 + val2 + carry;
            if(head == null) {
                head = tail = new ListNode(sum % 10);
            }else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            // 进位值为sum/10整数值
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carry != 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
