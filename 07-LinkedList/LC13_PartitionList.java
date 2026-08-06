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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1);
        ListNode bigHead = new ListNode(-1);
        ListNode curr = head;
        ListNode smallTail = smallHead;
        ListNode bigTail = bigHead;
        while(curr != null){
            if(curr.val < x){
                smallTail.next = curr;
                smallTail = smallTail.next;
            }
            else{
                bigTail.next = curr;
                bigTail = bigTail.next;
            }
            curr = curr.next;
        }
        bigTail.next = null;
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}