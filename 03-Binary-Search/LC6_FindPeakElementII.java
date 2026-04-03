/*
THERE ARE TWO WAYS TO START SEARCHING
1ST- COLUMNS 
2ND- ROWS
IF YOU CHOOSE COLUMNS 
SEARCH DIMENTION = COLUMNS (LEFT/RIGHT)
SO: 
BINARY SEARCH MOVEMENT= LEFT/RIGHT
*/

/*
Binary search = columns(log m)

Linear Scan = rows(n)

*/

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;

        int start=0;
        int end=c-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            int maxrow=0;
            for(int i=1;i<r;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }
            int current=mat[maxrow][mid];

            int left=-1;
            if(mid-1>=0){
                left=mat[maxrow][mid-1];
            }

            int right=-1;
            if(mid+1<=c-1){
                right=mat[maxrow][mid+1];
            }
            if(left<current && right<current){
                return new int[]{maxrow,mid};
            }
            else if(current<left){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}