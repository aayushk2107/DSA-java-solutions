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
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){         
            if(slow.val != fast.val){
                if(prev != null){
                    prev.next = fast;
                }
                if(prev == null){     
                    prev = slow;
                    slow = fast;
                    fast = fast.next;
                }
            }
            else if(slow.val == fast.val){
               fast = fast.next;
            }
        }
        return head;
    }
}