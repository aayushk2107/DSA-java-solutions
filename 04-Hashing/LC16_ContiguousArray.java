class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int currentLength=0;
            int zeroLength=0;
            int oneLength=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zeroLength++;
                }
                if(nums[j]==1){
                    oneLength++;
                }
                if(zeroLength==oneLength){
                    currentLength=j-i+1;
                }
                if(currentLength>maxLength){
                    maxLength=currentLength;
                }
            }
        }
        return maxLength;
    }
}