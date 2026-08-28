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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                int digit = l1.val + l2.val + carry;
                carry = digit / 10;
                int value = digit % 10;
                ListNode node = new ListNode(value);
                tail.next = node;
                tail = tail.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 == null && l2 != null){
                int digit = l2.val + carry;
                carry = digit / 10;
                int value = digit % 10;
                ListNode node = new ListNode(value);
                tail.next = node;
                tail = tail.next;
                l2 = l2.next;
            }
            else if(l1 != null && l2 == null){
                int digit = l1.val + carry;
                carry = digit / 10;
                int value = digit % 10;
                ListNode node = new ListNode(value);
                tail.next = node;
                tail = tail.next;
                l1 = l1.next;
            }
        }
        if(carry != 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}