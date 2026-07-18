BRUTE FORCE APPROACH

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int validSubarrays=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(!set.contains(nums[j])){
                    set.add(nums[j]);
                    if(set.size()==k){
                        validSubarrays++;
                    }
                    else if(set.size()>k){
                        break;
                    }
                }
                else if(set.contains(nums[j]) && k==set.size()){
                    validSubarrays++;
                }
            }
        }
        return validSubarrays;
    }
}