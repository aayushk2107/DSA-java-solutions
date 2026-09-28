class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        int p = 0;
        int sum2 = 0;
        while(p < nums.length){
            sum -= nums[p];
            if(sum == sum2){
                return p;
            }
            sum2 += nums[p];
            p++;
        }
        return -1;
    }
}