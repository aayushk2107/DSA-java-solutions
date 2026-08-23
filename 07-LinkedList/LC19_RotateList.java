class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int indices = 1;
        while(curr.next != null){
            indices++;
            curr = curr.next;
        }
        k = k % indices;                
        if(k == 0){                         
            return head;
        }
        indices = indices - k;
    
        ListNode prev = head;
        for(int i = 1; i < indices; i++){   
            prev = prev.next;
        }
        ListNode newHead = prev.next;
        prev.next = null;
        curr.next = head;                   
        return newHead;
    }
}