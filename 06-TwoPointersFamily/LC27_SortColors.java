BRUTE FORCE

    APPROACH 1:
    
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

APPROACH 2

    INSERTION SORT

    class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
