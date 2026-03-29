/*Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int start=0;
            int end=grid[i].length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(grid[i][mid]<0){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            count += grid[i].length-start;
        }
    return count;
    }
}