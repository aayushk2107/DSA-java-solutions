class Solution {
    public int removeDuplicates(int[] nums) {
        int slow=0;
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[slow]!=nums[i]){
                slow++;
                nums[slow]=nums[i];
                k++;
            }
        }
        return k;
    }
}