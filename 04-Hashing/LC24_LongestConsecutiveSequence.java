class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            int currentLength = 1;
            int currentNumber = num;
            if(!set.contains(num - 1)){
                while(set.contains(currentNumber + 1)){
                    currentLength++;
                    currentNumber++;
                }
            }
            if(maxLength < currentLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}