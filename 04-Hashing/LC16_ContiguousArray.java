/*BRUTE FORCE TECHNIQUE*/

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int currentLength=0;
            int zeroLength=0;
            int oneLength=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zeroLength++;
                }
                if(nums[j]==1){
                    oneLength++;
                }
                if(zeroLength==oneLength){
                    currentLength=j-i+1;
                }
                if(currentLength>maxLength){
                    maxLength=currentLength;
                }
            }
        }
        return maxLength;
    }
}

/*HERE WE MANIPULATED THE QUESTION TO BEHAVE LIKE SS= CS - OS BY CONVERTING 0 AS -1 AND 1 AS 1 
    SO NOW THE SS GIVES VALUE 0 AFTER SUBTRACTION SO THAT CHANGES THE EQUATION TO CS = OS*/



/* Optimal APPROACH*/
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            if(nums[i]==1){
                nums[i]=1;
            }
            sum=sum+nums[i];
            if(map.containsKey(sum)==true){
                int length=i-map.get(sum);
                if(maxlength<length){
                    maxlength=length;
                }
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlength;
    }
}
