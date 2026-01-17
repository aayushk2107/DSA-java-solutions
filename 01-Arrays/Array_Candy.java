//Q. given an integer array where candies[i] are the candies itself the ith kid is having find the max candy in the array and then add the extracandies provided to you and watch if after adding the extracandies to the candies every child is containing greater than the maximum candy if the answer is true print true in that place otherwise false
import java.util.Arrays;
public class Candy{
    public static void main(String[]args){
        int []candies={2,1,4,5,3};
        int off=2;
        boolean []an=candies(candies,fuckoff);
        System.out.println(Arrays.toString(an));
}
    static boolean[] candies(int []nums,int extracandies){
        boolean []result=new boolean[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            int element=extracandies+nums[i];
            if(element>=max){
                result[i]=true;
            }
        }
        return result;
    }
}
