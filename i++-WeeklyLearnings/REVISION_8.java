//revised Running sum
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int ans=runningSum(arr);
        System.out.println(ans);
    }
    static int runningSum(int[]nums){
        if(nums.length==0){
            return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}
