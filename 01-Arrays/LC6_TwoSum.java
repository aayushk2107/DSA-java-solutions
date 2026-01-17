/*Q. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice

You can return the answer in any order.*/

import java.util.Arrays;
public class TwoSum{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []an=twoSum(arr,5);
        System.out.println(Arrays.toString(an));
    }
    static int[] twoSum(int []nums,int target){
        if(nums.length==0){
            return new int []{-1};
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}