class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start=1;
        int end=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>end){
                end=candies[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(validator(candies,k,mid)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public boolean validator(int []nums,long k,int candies){
        long currentK=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=candies){
                currentK=currentK+nums[i]/candies;
            }
        }
        return currentK>=k;
    }
}
