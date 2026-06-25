/*UNIVERSAL FORMULA SUBARRAY SUM=CURRENT SUM - OLD SUM
    SO IN THIS QUESTION OLD SUM=CURRENTSUM - SUBARRAY SUM(K)
    HOW SUBARRAY SUM BECOMES K CAUSE WE ARE FINDING A SUM WHICH IS EQUAL TO K ITSELF*/


class Solution {
    public int subarraySum(int[] nums, int k) {
        int validSubarray=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k){
                    validSubarray++;
                }
            }
        }
        return validSubarray;
    }
}

//The Optimal Solution having Hashmap+Prefix sum*/
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int validSubarray=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int needed=sum-k;
            if(map.containsKey(needed)==true){
                validSubarray+=map.get(needed);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return validSubarray;
    }
}
