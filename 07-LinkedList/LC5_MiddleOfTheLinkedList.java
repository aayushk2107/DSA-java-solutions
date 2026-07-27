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
    public ListNode middleNode(ListNode head) {
        int index=0;
        ListNode next=head;
        while(next != null){
            index++;
            next=next.next;
        }
        int median=index/2;
        next=head;
        while(median >0){
            next=next.next;
            median--;
        }
        return next;
    }
}