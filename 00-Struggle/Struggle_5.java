//Q. My wrong code of the question TWO SUM II which can't able to pass 1 testcase out of 3 on leetcode 
 What my mistakes are 
 I moved both pointers unconditionally (start++ and end--)

 A single sum comparison does not justify eliminating both sides

 I discarded valid pairs (like 2 + 7) without proving they’re impossible.

 Two pointers require moving only the side that’s logically wrong, not both. 
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==0){
            return new int[]{-1,-1};
        }
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }
                start++;
                end--;
            }
        return new int[]{-1,-1};
    }
}