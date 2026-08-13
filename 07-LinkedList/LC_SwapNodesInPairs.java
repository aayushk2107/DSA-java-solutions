class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode next = curr.next;
        ListNode pairTail = null;
        int indices = 0;
        while(true){
            curr.next = prev;
            prev.next = next;
            if(pairTail == null && indices == 0){
                head = curr;
                indices++;
            }
            else {
                pairTail.next = curr;
            }
            pairTail = prev;
            if(next == null || next.next == null){
                break;
            }
            prev = next;
            curr = prev.next;
            next = curr.next;
        }
        return head;
    }
}