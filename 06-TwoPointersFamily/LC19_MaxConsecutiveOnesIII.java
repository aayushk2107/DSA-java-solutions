class Solution {
    public int longestOnes(int[] nums, int k) {
        int globalLength=0;
        int zeroCount=0;
        int length=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            if(zeroCount<=k){
                length++;
                if(length>globalLength){
                    globalLength=length;
                }
            }
            while(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                    length++;
                }
                left++;
                length--;
            }
        }
        return globalLength;
    }
}