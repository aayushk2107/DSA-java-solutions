class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = null;
        if (curr != null) {
            next = curr.next;
        }
        ListNode groupTail = null;
        ListNode groupStart = head;
        ListNode indNode = head;
        int indices = 1;

        while (true) {
            indNode = groupStart;
            indices = 1;
            while (indNode != null && indices < k) {
                indNode = indNode.next;
                indices++;
            }
            if (indices < k || indNode == null) {
                break;
            }
            prev = groupStart;
            curr = prev.next;
            next = null;
            if (curr != null) {
                next = curr.next;
            }
            int remaining = k - 1;
            while (remaining > 0 && curr != null) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
                remaining--;
            }
            if (groupTail == null) {
                head = prev;
            } else {
                groupTail.next = prev;
            }
            groupStart.next = curr;
            groupTail = groupStart;
            groupStart = curr;
            if (groupStart == null) {
                break;
            }
        }
        return head;
    }
}