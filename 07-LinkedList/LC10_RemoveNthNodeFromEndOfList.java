APPROACH 1 - CAME UP WITH TWO PASS 
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int length=0;
        ListNode curr =head;
        while(curr != null){
            curr=curr.next;
            length++;
        }
        int nodeSize=length-n;
        if(nodeSize == 0){
            head=head.next;
            return head;
        }
        int indices=0;
        curr=head;
        ListNode prev=null;
        while(indices < nodeSize){
            prev=curr;
            curr=curr.next;
            indices++;
        }
        prev.next=curr.next;
        return head;
    }
}
