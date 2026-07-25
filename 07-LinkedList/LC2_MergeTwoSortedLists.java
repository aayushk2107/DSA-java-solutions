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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode dummy =new ListNode(-1);
         ListNode tail=dummy;
         ListNode curr1=list1;
         ListNode curr2=list2;
         while(curr1 != null && curr2 != null){
            if(curr1.val<curr2.val){
                tail.next=curr1;
                tail=curr1;
                curr1=curr1.next;
            }
            else{
                tail.next=curr2;
                tail=curr2;
                curr2=curr2.next;
            }
         }
         if(curr1 !=null){
            tail.next=curr1;
         }
         else if(curr2 != null){
            tail.next=curr2;
         }
         return dummy.next;
    }
}