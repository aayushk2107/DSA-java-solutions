class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int niceSubarrays=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
            sum=sum+nums[i];
            int oldSum=sum-k;
            if(map.containsKey(oldSum)==true){
                niceSubarrays+=map.get(oldSum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return niceSubarrays;
    }
}