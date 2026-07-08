class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>=1){
                if(nums[i]==nums[i-1]){
                    continue;
                }
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int start=j+1;
                int end=nums.length-1;
                while(start<end){
                    long sum=(long)nums[i]+nums[j]+nums[start]+nums[end];
                    if(sum==target){
                        List<Integer> quadruplets=new ArrayList<>();
                        quadruplets.add(nums[i]);
                        quadruplets.add(nums[j]);
                        quadruplets.add(nums[start]);
                        quadruplets.add(nums[end]);
                        ans.add(quadruplets);
                        start++;
                        end--;
                        while(start<end && nums[start] == nums[start-1]){
                            start++;
                        }
                        while(start<end && nums[end] ==nums[end+1]){
                            end--;
                        }
                    }
                    else if(sum>target){
                        end--;
                    }
                    else{
                        start++;
                    }
                }
            }
        }
        return ans; 
    }
}