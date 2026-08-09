class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head;
        ListNode beforeLeft = null;
        ListNode atleft = null;
        int indices = 1;
        while (curr != null) {
            if (indices < left) {
                beforeLeft = curr;
                curr = curr.next;
                indices++;
            }
            else if (indices <= right) {

                if (indices == left) {
                    atleft = curr;
                    prev = null;
                }
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                indices++;
            }
            else {
                break;
            }
        }
        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }
        atleft.next = curr;
        return head;
    }
}