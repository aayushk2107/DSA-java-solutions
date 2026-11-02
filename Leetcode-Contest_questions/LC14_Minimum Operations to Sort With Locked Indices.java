class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int prefixMax = 0;
        int unlock = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > i + 1 && prefixMax < nums[i]){
                prefixMax = nums[i];
            }
            if(locked[i] == 1 && i + 1 <= prefixMax){
                unlock++;
            }
            if(unlock > k){
                return -1;
            }
        }
        int operationSwap = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    operationSwap++;
                }
            }
        }
        return operationSwap + unlock;
    }
}