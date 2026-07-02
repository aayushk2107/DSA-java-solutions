/*MY BRUTE FORCE SOLUTION*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=val){
                        int temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                        k++;
                        break;
                    }
                }
            }
            else{
                k++;
            }
        }
        return k;
    }
}


/*OPTIMAL APPROACH */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
                k++;
            }
        }
        return k;
    }
}