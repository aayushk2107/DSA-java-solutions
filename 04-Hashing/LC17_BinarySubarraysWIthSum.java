/*BRUTE FORCE*/
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int validSubarray=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal){
                    validSubarray++;
                }
            }
        }
        return validSubarray;
    }
}


/*BELOVED FORMULA BREAKDOWN
SUBARRAY SUM = GOAL
CURRENTSUM-OLDSUM = GOAL
OLDSUM = CURRENTSUM - GOAL
*/

/*OPTIMAL SOLUTION*/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int validSubarray=0;
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int oldSum=sum-goal;
            if(map.containsKey(oldSum)==true){
                validSubarray+=map.get(oldSum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return validSubarray;
    }
}