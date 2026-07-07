class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>=1){
                if(nums[i]==nums[i-1]){
                    continue;
                }
            }
            int sum=-nums[i];
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]==sum){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[start]);
                    triplet.add(nums[end]);
                    ans.add(triplet);
                    start++;
                    end--;
                    while(start<end && nums[start]==nums[start-1]){
                        start++;
                    }
                    while(start<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }
                else if(nums[start]+nums[end]>sum){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return ans;
    }
}