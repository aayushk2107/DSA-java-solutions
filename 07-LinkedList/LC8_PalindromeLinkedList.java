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

APPROACH -2 WITH O(1) EXTRA SPACE REMOVING OTHER LIST 

    A -> B -> C -> null
          ↑
          |
D --------+  THE LIST AFTER REVERSING


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
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null){
            slow=slow;
        }
        else{
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode next=slow;
        while(next != null){
            next=next.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        while(prev != null && head.next!=null){
            if(head.val != prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}
    
