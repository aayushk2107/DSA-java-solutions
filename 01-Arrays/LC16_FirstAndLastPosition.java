/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left=-1,right=-1;
        int l=0,r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>=target){
                r=m-1;
            }
            else{
                l=m+1;
            }
            if(nums[m]==target){
                left=m;
            }
        }
        l=0;r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]<=target){
                l=m+1;
            }
            else{
                r=m-1;
            }
            if(nums[m]==target){
                right=m;
            }
        }
        return new int[]{left,right};
    }
}
