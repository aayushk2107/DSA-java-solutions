class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            map.put(i , sum);
        }
        int number = 0;
        int left = 0;
        long subarrayCount = 0;
        for(int right = 0; right < nums.length; right++){
            if(left == 0 && right == 0){
                if(nums[right] >= minK && nums[right] <= maxK){
                    subarrayCount++;
                    number++;
                    left++;
                }
            }
            else if(left == 0 && right != 0){
                int element = map.get(right) - map.get(right - 1);
                if(element >= minK && element <= maxK){
                 subarrayCount++;
                 subarrayCount += number;
                 number++;
                 left++;
                }
             }
            else if(left != 0){
                 int element = map.get(right) - map.get(right - 1); 
                 if(element >= minK && element <= maxK){
                     subarrayCount++;
                     subarrayCount += number;
                     number++;
                     left++;
                 }
                 else{
                     number = 0;
                     left = 0;
                }
            }
        }
        return subarrayCount;
    }
}