/*
Q.Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.


****PRECIOUS UNDERSTANDINGS I GOT FROM THIS QUESTION THE ENTIRE LOGIC I FOUND BY MYSELF BUT GOT TRIPPED OVER A TINY PART****

In 2D problems, if a value matters later, store its index immediately.
Value without position is useless.

Here’s the truth you must engrave:

Columns don’t move by j++.
Columns are traversed by changing the row index.

So:

j = which column

looping over a column = change row index
*/

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    col=j;
                }
            }
            boolean lucky = true;
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                result.add(min);
            }
        }
        return result;
    }
}
