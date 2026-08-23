class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev1 = null;
        while(fast != null && fast.next != null){
            prev1 = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev1.next = null;

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        ListNode tail = prev;
        
        ListNode curr1 = head;
        while (curr1 != null && tail != null) {  
            ListNode next1 = curr1.next;
            ListNode next2 = tail.next;
            curr1.next = tail;
            if (next1 != null) {
                tail.next = next1;
            }
            curr1 = next1;
            tail = next2;
        }
    }
}