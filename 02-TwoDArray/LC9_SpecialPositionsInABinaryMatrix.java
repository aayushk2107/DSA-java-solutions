class Solution {
    public int numSpecial(int[][] mat) {
        int specialPosition = 0;
        for(int i=0;i<mat.length;i++){
            int  col= 0;
            int oneCount = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    oneCount++;
                    col = j;
                }
                if(oneCount > 1){
                    break;
                }
            }
            if(oneCount == 1){
                int onCount = 0;
                for(int p = 0;p < mat.length;p++){
                    if(mat[p][col] == 1){
                        onCount++;
                    }
                }
                if(onCount == 1){
                    specialPosition++;
                }
            }
        }
        return specialPosition;
    }
}
