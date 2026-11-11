Approach 1 : My brute Force Approach 

I assumed starting a grid at each 1 and traversed it as long as i found 1's and maintain a consistent count of 1 and count the area Took little help in implementation

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        if(matrix.length == 1 && matrix[0].length == 1){
            if(matrix[0][0] == '1'){
                maxArea = 1;
            }
            else{
                maxArea = 0;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == '1'){
                    int r = i;
                    int c = j;
                    int validR = 0;
                    int minWidth = 0;
                    int iteration = 0;
                    while(r < matrix.length){
                        int validC = 0;
                        while(c < matrix[r].length){
                            if(matrix[r][c] == '1'){
                                validC++;
                                if(iteration == 0){
                                    minWidth++;
                                }
                            }
                            else if(matrix[r][c] != '1'){
                                break;
                            }
                            c++;
                        }
                        iteration++;
                        if(minWidth > validC){
                            minWidth = validC;
                        }
                        validR++;
                        int currentArea = minWidth * validR;
                        if(maxArea < currentArea){
                            maxArea = currentArea;
                        }
                        c = j;
                        r++;
                    }
                }
            }
        }
        return maxArea;
    }
}