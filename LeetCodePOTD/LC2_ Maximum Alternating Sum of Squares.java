class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int subtractCount = nums.length / 2;
        long sum = 0;
        for(int i = 0;i < nums.length;i++){
            long square = nums[i] * nums[i];
            if(i < subtractCount){
                sum -= square;
            }
            else{
                sum += square;
            }
        }
        return sum;
    }
}