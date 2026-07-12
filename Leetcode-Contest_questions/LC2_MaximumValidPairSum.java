class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxValidI=Integer.MIN_VALUE;
        int answer=Integer.MIN_VALUE;
        for(int j=k;j<nums.length;j++){
            int newValidIndex=j-k;
            if(nums[newValidIndex]>maxValidI){
                maxValidI=nums[newValidIndex];
            }
            int currentSum=nums[j]+maxValidI;
            if(currentSum>answer){
                answer=currentSum;
            }
        }
        return answer;
    }
}