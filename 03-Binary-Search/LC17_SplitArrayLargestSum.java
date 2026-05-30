class Solution {
    public int splitArray(int[] nums, int k) {
        int start=nums[0];
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            end=end+nums[i];
            if(nums[i]>start){
                start=nums[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(maxSum(nums,k,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }   
    public boolean maxSum(int []arr,int k,int sum){
        int currentSum=arr[0];
        int subArrays=1;
        for(int i=1;i<arr.length;i++){
            if(currentSum+arr[i]<=sum){
                currentSum=currentSum+arr[i];
            }
            else{
                currentSum=arr[i];
                subArrays++;
            }
        }
         return subArrays<=k;
    }
}