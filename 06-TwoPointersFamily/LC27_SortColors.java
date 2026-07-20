class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]==1){
                one++;
            }    
            if(nums[i]==2){
                two++;
            }
        }               
        for(int i=0;i<=zero-1;i++){
            nums[i]=0;
        }
        for(int i=zero;i<=zero+one-1;i++){
            nums[i]=1;
        }
        for(int i=one+zero;i<=zero+one+two-1;i++){
            nums[i]=2;
        }
    }
}