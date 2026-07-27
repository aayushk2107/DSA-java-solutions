/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int curr=node.next.val;
        node.val=curr;
        ListNode curr1=node.next.next;
        node.next=curr1;
    }
}