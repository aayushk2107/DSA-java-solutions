/*Q. Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            if(mat.length%2==0){
                sum=sum+mat[i][n-i-1]+mat[i][i];
            }
            else{
                if(i==n/2){
                    sum=sum+mat[n/2][n/2];
                }
                else{
                    sum=sum+mat[i][n-i-1]+mat[i][i];
                }
            }
        }
        return sum;
    }
}