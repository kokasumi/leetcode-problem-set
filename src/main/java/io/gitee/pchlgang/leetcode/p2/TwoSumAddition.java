package io.gitee.pchlgang.leetcode.p2;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/4/16 17:30
 * @description
 * @since v1.0
 */
public class TwoSumAddition {
    public static void main(String[] args) {
        int[] array1 = {2,4,3}, array2 = {5,6,4};
        calculateAddResult(array1,array2);
        int[] array3 = {0}, array4 = {0};
        calculateAddResult(array3,array4);
        int[] array5 = {9,9,9,9,9,9,9}, array6 = {9,9,9,9};
        calculateAddResult(array5,array6);
    }

    private static void calculateAddResult(int[] array1,int[] array2) {
        ListNode node1 = listNodeByArray(array1);
        ListNode node2 = listNodeByArray(array2);
        System.out.printf("node1: %s\n", listNodeArrayFormat(node1));
        System.out.printf("node2: %s\n", listNodeArrayFormat(node2));
        listNodeArrayFormat(node2);
        ListNode addResult1 = TwoSumAddSolution.addTwoNumbers(node1,node2);
        System.out.printf("node1 + node2: %s\n", listNodeArrayFormat(addResult1));
    }

    private static ListNode listNodeByArray(int[] array) {
        ListNode head = null,tail = null;
        for (int x : array) {
            if(head == null) {
                head = tail = new ListNode(x);
            }else {
                tail.next = new ListNode(x);
                tail = tail.next;
            }
        }
        return head;
    }

    /**
     * 将ListNode转换为Array形式
     * @param node
     * @return
     */
    private static String listNodeArrayFormat(ListNode node) {
        StringBuilder builder = new StringBuilder("[");
        while (node != null) {
            builder.append(node.val).append(",");
            node = node.next;
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        return builder.toString();
    }
}
