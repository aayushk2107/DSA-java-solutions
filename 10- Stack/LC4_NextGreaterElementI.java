class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i] , i);
        }
        Stack<Integer> s1 = new Stack<>();
        s1.push(nums2[0]);
        for(int i = 1; i < nums2.length; i++){
            if(!s1.isEmpty() && nums2[i] < s1.peek()){
                s1.push(nums2[i]);
            }
            while(!s1.isEmpty() && nums2[i] > s1.peek()){
                if(map.containsKey(s1.peek())){
                    ans[map.get(s1.peek())] = nums2[i];
                    s1.pop();
                }
                else if(!map.containsKey(s1.peek())){
                    s1.pop();
                }
            }
            s1.push(nums2[i]);
        }
        for(int i = 0 ; i < ans.length; i++){
            if(ans[i] == 0){
                ans[i] = -1;
            }
        }
        return ans;
    }
}