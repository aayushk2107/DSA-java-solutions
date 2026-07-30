APPROACH 1 - REVERSE THE LIBKED LIST INTO DIFFERENT LIST AND COMPARE WITH THE ACTUAL ONE TOOK O(N)
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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=null;
        ListNode curr=head;
        while( curr != null){
            ListNode newNode =new ListNode(curr.val);
            newNode.next=dummy;
            dummy=newNode;
            curr=curr.next;
        }
        curr=head;
        ListNode curr2=dummy;
        while(curr2 != null && curr != null){
            if(curr2.val != curr.val){
                return false;
            }
            curr2=curr2.next;
            curr=curr.next;
        }
        return true;
    }
}