/*
QUESTION NO. 34
Did wrong code and it ran even on leetcode but after submitting it i realised the blunder i did*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> a1=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && j=0){
                a1.add(i);
                j++;
            }
            else if()
        }
        if(a1.size()==0){
            return new int[]{-1,-1};
        }
        int []arr=new int[a1.size()];
        for(int i=0;i<a1.size();i++){
            arr[i]=a1.get(i);
        }
        return arr;
    }
}