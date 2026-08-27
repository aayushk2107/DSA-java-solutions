APPROACH 1 - STORE THE LIST IN THE HASHSET AND RUN THE LOOP AGAIN IF THAT REFERENCE WE FOUND IN THE LIST WHILE TRAVERSING IN THE SECOND
    LIST IT MEANS INTERSECTION EXISTS
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

APPROACH 2 
    THE APPROACH FUNCTIONS IN THIS WAY - WHEN P REACHES NULL POINT IT TOWARDS HEADA AND WHEN Q REACHES NULL POINT IT TO HEADB SIMPLY JUST 

    public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while(p != q){
            if(p == null){
                p = headB;
            }
            else{
                p = p.next;
            }
            if(q == null){
                q = headA;
            }
            else{
                q = q.next;
            }
        }
        return p;
    }
}
