APPROACH 1
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = headA;
        while(curr != null){
            set.add(curr);
            curr = curr.next;
        }
        ListNode curr2 = headB;
        ListNode ans = null;
        while(curr2 != null){
            if(set.contains(curr2)){
                ans = curr2;
                break;
            }
            curr2 = curr2.next;
        }
        return ans;
    }
}