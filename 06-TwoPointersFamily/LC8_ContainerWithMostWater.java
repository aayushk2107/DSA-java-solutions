class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        while(start<end){
            int currentArea=0;
            if(height[start]<height[end]){
                int length=end-start;
                currentArea=length*height[start];
                start++;
            }
            else{
                int length=end-start;
                currentArea=length*height[end];
                end--;
            }
            if(currentArea>maxArea){
                maxArea=currentArea;
            }
        }
        return maxArea;
    }
}