class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[slow]=nums[i];
                slow++;
            }
        }
        while(slow<nums.length){
            nums[slow]=0;
            slow++;
        }
    }
}