class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double bestSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(i == k-1){
                if(sum>bestSum){
                    bestSum=sum;
                }
            }
            else if(i > k-1){
                sum=sum-nums[i-k];
                if(sum>bestSum){
                    bestSum=sum;
                }
            }
        }
        return (double)bestSum/k;
    }
}