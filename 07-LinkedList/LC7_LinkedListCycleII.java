APPROACH 1 - HASHSET O(N) SPACE


 class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode curr=head;
        HashSet<ListNode> set=new HashSet<>();
        while(curr != null){
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
            curr=curr.next;
        }
        return null;
    }
}