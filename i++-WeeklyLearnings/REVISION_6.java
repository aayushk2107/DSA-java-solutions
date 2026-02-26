//Revised beautiful kadane algorithm
public class Main{
    public static void main(String[]args){
        int[]arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(arr));
    }
    static int kadane(int []nums){
        if(nums.length==0){
            return -1;
        }
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
             if(currentsum+nums[i]>nums[i]){
                 currentsum=currentsum+nums[i];
             }
             else{
                 currentsum=nums[i];
             }
             if(currentsum>maxsum){
                 maxsum=currentsum;
             }
        }
        return maxsum;
    }
}