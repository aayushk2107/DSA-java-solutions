/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1 (critical case)
Plain text
[5, 1]
start = 0, mid = 0, end = 1
nums[start] = 5, nums[mid] = 5
Now check:
nums[start] < nums[mid] → ❌ false
nums[start] <= nums[mid] → ✅ true
But clearly, the “left half” (just one element) is sorted.
👉 If you use <, you incorrectly say “not sorted”
👉 If you use <=, you correctly say “sorted”
Example 2 (single element)
Plain text
[3]
start = mid = end = 0
< → false
<= → true
A single element is always sorted.
So <= keeps logic consistent.

So because of these 2 cases we do that right? Or not? Dude ?.

You are using it because:
In binary search on rotated arrays,
you only reject a half when you have proof it’s broken.
And the only proof is:
Plain text
nums[start] > nums[mid]
Everything else → treat as sorted.

 */

 class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[mid]>target && nums[start]<=target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
