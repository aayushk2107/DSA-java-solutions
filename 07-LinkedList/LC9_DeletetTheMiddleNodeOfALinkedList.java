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
    public ListNode deleteMiddle(ListNode head) {
       if(head.next == null){
            return null;
       }
       ListNode slow=head;
       ListNode fast=head;
       ListNode prev=head;
       int indices=0;
       while(fast != null && fast.next !=null){
            indices++;
            if(indices >=2){
                prev=prev.next;
            }
            slow=slow.next;
            fast=fast.next.next;
       }
       prev.next=slow.next;
       return head;
    }
}