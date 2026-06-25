/*Another  ALTERNATIVE APPROACH IS (CURRENTSUM-OLDSUM) % K==0
    WHICH CAN ASLO BE WRITTEN AS SUBARRAYSUM % K ==0 AMD THAT'S WHAT WE JUST DID
    AND CURRENTSUM % K == OLDSUM % K  AND HENCE THEN WE STORE REMAINDERS*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int remainder=sum%k;
            if(map.containsKey(remainder)==true){
                int requiredIndex=i-map.get(remainder);
                if(requiredIndex>=2){
                    return true;
                }
            }
            if(!map.containsKey(remainder)){
                map.put(remainder,i);
            }
        }
        return false;
    }
}
