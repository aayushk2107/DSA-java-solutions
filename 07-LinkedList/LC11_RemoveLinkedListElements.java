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
    public ListNode removeElements(ListNode head, int val) {
        ListNode slow=head;
        ListNode prev=null;
        while(slow != null){
            if(head.val == val){
                head = head.next;
                slow = head;
            }
            if(head == null){
                return null;
            }  
            if(head.val != val){
                if(slow.val == val){
                    prev.next = slow.next;
                    slow = slow.next;
                }
                else{
                    prev = slow;
                    slow = slow.next;
                }
            }
        }
        return head;
    }
}