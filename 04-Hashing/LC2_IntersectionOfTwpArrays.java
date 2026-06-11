/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> a1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            a1.add(nums1[i]);
        }
        HashSet <Integer> a2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(a1.contains(nums2[i])==true){
                a2.add(nums2[i]);
            }
        }
        int []arr=new int[a2.size()];
        int index=0;
        for(Integer x:a2){
            arr[index]=x;
            index++;
        }
        return arr;
    }
}