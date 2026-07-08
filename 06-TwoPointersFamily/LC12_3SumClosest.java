class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int globalDistance=Integer.MAX_VALUE;
        int sum=0;
        if(nums.length==3){
            sum=nums[0]+nums[1]+nums[2];
            return sum;
        }
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1; 
            while(start<end){
                int currentSum=nums[i]+nums[start]+nums[end];
                if(currentSum<target){
                    start++;
                }
                else if(currentSum>target){
                    end--;
                }
                else{
                    return currentSum;
                }
                int currentDistance=Math.abs(currentSum-target);
                if(currentDistance<globalDistance){
                    globalDistance=currentDistance;
                    sum=currentSum;
                }
            }
        }
        return sum;
    }
}
