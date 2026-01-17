//Q. Leetcode candy question with exposing main method 
import java.util.ArrayList;
public class MainCandys{
    public static void main(String[]args){
        int []arr={1,2,9,5,4,3};
        ArrayList<Boolean> answer=candies(arr,3);
        System.out.println(answer);
    }
    static ArrayList<Boolean> candies(int []nums,int extraCandies){
        ArrayList<Boolean> result=new ArrayList<>(nums.length);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            boolean temp=extraCandies+nums[i]>=max;
            result.add(temp);
        }
        return result;
    }
}