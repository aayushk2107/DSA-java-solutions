class Solution {
    public int trap(int[] height) {
        int waterStorage=0;
        int start=0;
        int end=height.length-1;
        int leftMax=0;
        int rightMax=0;
        while(start<=end){
            if(leftMax<height[start]){
                leftMax=height[start];
            }
            if(rightMax<height[end]){
                rightMax=height[end];
            }
            if(leftMax<rightMax){
                waterStorage+=leftMax-height[start];
                start++;
            }
            else{
                waterStorage+=rightMax-height[end];
                end--;
            }
        }
        return waterStorage;
    }
}