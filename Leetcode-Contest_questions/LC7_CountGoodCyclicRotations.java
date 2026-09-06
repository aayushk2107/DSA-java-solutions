class Solution {
    public int countGoodRotations(int[] nums) {
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0;i <= nums.length / 2 - 1; i++){
            sum1 += nums[i];
        }
        for(int i = nums.length / 2; i < nums.length; i++){
            sum2 += nums[i];
        }
        int count = 0;
        int length = nums.length / 2;
        for(int i = 0; i < nums.length; i++){
            if(sum1 > sum2){
                count++;
            }
            int left = nums[i];
            int enter = nums[(i + length) % nums.length];
            sum1 += enter;
            sum1 -= left;

            sum2 += left;
            sum2 -= enter;
        }
        return count;
    }
}