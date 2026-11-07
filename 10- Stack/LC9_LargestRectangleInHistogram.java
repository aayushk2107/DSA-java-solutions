Approach 1 - Brute Force Passed 91 / 99 Testcases 

class Solution {
    public int largestRectangleArea(int[] heights) {
        long maxArea = 0;
        for(int i = 0; i < heights.length ; i++){
            long fixedLength = heights[i];
            for(int j = i; j < heights.length; j++){
                if(heights[j] < fixedLength){
                    fixedLength = heights[j];
                }
                long width = j - i + 1;
                long currentArea = fixedLength * width;
                if(currentArea > maxArea){
                    maxArea = currentArea;
                }
            }
        }
        return (int)maxArea;
    }
}