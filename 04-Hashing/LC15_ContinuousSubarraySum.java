/*Another  ALTERNATIVE APPROACH IS (CURRENTSUM-OLDSUM) % K==0*/

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
