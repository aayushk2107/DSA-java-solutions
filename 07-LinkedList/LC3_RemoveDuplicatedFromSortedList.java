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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast != null){
            if(slow.val != fast.val){
                slow.next=fast;
                slow=fast;
            }
            else{
                if(fast.next==null){
                    slow.next=null; 
                }
                fast=fast.next;
            }
        }
        return head;
    }
}