class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev1 = reverse(l1);
        ListNode prev2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(prev1 != null || prev2 != null){
            int x = 0;
            int y = 0;
            if(prev1 != null){
                x = prev1.val;
            }
            if(prev2 != null){
                y = prev2.val;
            }
            int digit = x + y + carry;
            int value = digit % 10;
            carry = digit / 10;

            ListNode node = new ListNode(value);
            tail.next = node;
            tail = tail.next;

            if(prev1 != null){
                prev1 = prev1.next;
            }

            if(prev2 != null){
                prev2 = prev2.next;
            }
        }

        if(carry != 0){
            tail.next = new ListNode(carry);
        }

        return reverse(dummy.next);
    }
}