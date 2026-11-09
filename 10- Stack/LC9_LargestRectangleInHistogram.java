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

Approach 2 - An intellectual Approach with a kind of pattern which is non intuitive to me

    The Approach looks for two boundary (left and right) where the it is constantly searching for elements smaller than it
    The question is why cause any element which is smaller than the current element can't form a rectangle simply

    class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s1 = new Stack<>();
        long maxArea = 0;
        for(int i = 0; i <= heights.length; i++){
            int currentHeight = 0;
            if(i == heights.length){
                currentHeight = 0;
            }
            else{
                currentHeight = heights[i];
            }
            while(!s1.isEmpty() && heights[s1.peek()] >= currentHeight){
                long element = heights[s1.peek()];
                s1.pop();
                long currentArea = 0;
                if(!s1.isEmpty()){
                    currentArea = element * (i - s1.peek() - 1);
                }
                else{
                    currentArea = element * (i + 1 - 1);
                }
                if(currentArea > maxArea){
                    maxArea = currentArea;
                }
            }
            s1.push(i);
        }
        return (int)maxArea;
    }
}
