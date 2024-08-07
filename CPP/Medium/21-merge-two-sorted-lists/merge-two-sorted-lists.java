/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode = new ListNode();
        ListNode temp = currentNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                currentNode = currentNode.next;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                currentNode = currentNode.next;
                list2 = list2.next;
            }

        }
        while (list1 != null) {
            currentNode.next = list1;
            currentNode = currentNode.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            currentNode.next = list2;
            currentNode = currentNode.next;
            list2 = list2.next;
        }
        return temp.next;
    }
}