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


APPROACH 2 - SOLVED THIS IN ONE PASS USING TWO POINTERS FAST SLOW METHOD IT'S AN AMAZING SOLUTION TBH LOVED IT 

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
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        int indices=0;
        while(fast != null){
            indices++;
            fast=fast.next;
            if(indices > n){
                prev=slow;
                slow=slow.next;
            }
        }
        if(slow == head){
            return slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
