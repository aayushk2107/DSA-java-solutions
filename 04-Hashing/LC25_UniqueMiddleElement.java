class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int median=nums.length/2;
        int element=nums[median];
        for(int i=0;i<nums.length;i++){
            if(set.contains(element)&& nums[i]==element){
                return false;
            }
            set.add(nums[i]);
        }
        return true;
    }
}