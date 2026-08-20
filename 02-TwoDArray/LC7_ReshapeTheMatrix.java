class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] arr = new int[r][c];
        int row = 0;
        int col = 0;
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = mat[row][col];
                if (col == mat[0].length - 1) {
                    row++;
                    col = 0;
                } 
                else {
                    col++;
                }
            }
        }
        return arr;
    }
}