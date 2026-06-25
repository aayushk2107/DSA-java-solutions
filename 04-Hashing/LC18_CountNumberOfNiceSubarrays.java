/*Step 1:

Can I transform the thing I care about
into a SUM?*/

/*   AGAIN MANIPULATED THE QUESTION INTO A PATTERN WHICH FITS THE SS= CS - OS
    SS = K
    CS - OS = K
    OS = CS(SUM) - K    */
/*
When you see a subarray problem:

1. What property do I care about?

2. Can I encode that property
   as numbers?

3. Does the subarray sum
   become the thing I want?

4. If yes:

   SS = Target

   CS - OS = Target

   OS = CS - Target*/

=======INVARIANT======== 
    
The quantity I care about
must be representable as
a subarray sum.




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
