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


OPTIMAL SOLUTION USING ATMOST(K) - ATMOST(K-1) 

    class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int atMostK=0;
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            atMostK+=right-left+1;
        }
        int left1=0;
        int atMostK1=0;
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map2.put(nums[right],map2.getOrDefault(nums[right],0)+1);
            while(map2.size()>k-1){
                map2.put(nums[left1],map2.get(nums[left1])-1);
                if(map2.get(nums[left1])==0){
                    map2.remove(nums[left1]);
                }
                left1++;
            }
            atMostK1+=right-left1+1;
        }
        return atMostK-atMostK1;
    }
}
