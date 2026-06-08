class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            if(end<nums[i]){
                end=nums[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(validator(nums,threshold,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public boolean validator(int []arr,int threshold,int divisor){
        double quotientSum=0;
        for(int i=0;i<arr.length;i++){
            quotientSum=quotientSum+Math.ceil((double)arr[i]/divisor);
        }
        return quotientSum<=threshold;
    }
}