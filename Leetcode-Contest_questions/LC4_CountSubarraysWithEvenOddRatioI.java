class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int validSubarrays=0;
        for(int i=0;i<nums.length;i++){
            int evenCount=0;
            int oddCount=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] % 2 == 0){
                    evenCount++;
                }
                if(nums[j] % 2 != 0){
                    oddCount++;
                }
                if(oddCount>0 && 1L*evenCount*b<=1L*a*oddCount){
                    validSubarrays++;
                    break;
                }
            }
        }
        return validSubarrays;
    }
}