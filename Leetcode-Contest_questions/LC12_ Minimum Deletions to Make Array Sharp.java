class Solution {
    public int minDeletions(int[] nums) {
        int i = 1;
        int minCount = 0;
        int slow = 0;
        while(i <= nums.length - 1){
            if((nums[slow] ^ nums[i]) == 0){
                minCount++;
                i++;
            }
            else{
                slow = i;
                i++;
            }
        }
        return minCount;
    }
}