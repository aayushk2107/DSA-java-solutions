class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int globalLength=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int length=0;
        for(int i=0;i<nums.length;i++){
            if(sum<target){
                sum=sum+nums[i];
                length++;
            }
            while(sum>=target){
                if(length<globalLength){
                    globalLength=length;
                }
                sum=sum-nums[left];
                left++;
                length--;
            }
        }
        if(globalLength==Integer.MAX_VALUE){
            return 0;
        }
        return globalLength;
    }
}