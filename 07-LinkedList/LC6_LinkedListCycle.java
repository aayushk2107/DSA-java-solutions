/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> yoo=new HashSet<>();
        while(head !=null){
            if(yoo.contains(head)){
                return true;
            }
            yoo.add(head);
            head=head.next;
        }
        return false;
    }
}


OPTIMAL SOLUTION

    ALGORITHM USED - FLOYD'S CYCLE DETECTION

    TECHNIQUE USED - FAST AND SLOW APPROACH

    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
