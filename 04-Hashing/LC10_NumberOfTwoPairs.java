class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])==true){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                count=count+map.get(nums[i])-1;
            }
            else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}
