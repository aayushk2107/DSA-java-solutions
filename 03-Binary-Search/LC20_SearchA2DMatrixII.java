/*

The target, if it exists,
must lie in the remaining rectangle.

 */
 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=0;
        int cols=matrix[0].length-1;
        while(rows<matrix.length && cols>=0){
            if(matrix[rows][cols]==target){
                return true;
            }
            if(matrix[rows][cols]<target){
                rows++;
            }
            else{
                cols--;
            }
        }
        return false;
    }
}