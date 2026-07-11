Practised Binary Search by dry running 10 times on paper
Understood things like 
Binary search always found the boundary dictated by a Boolean condition
_ and that Boolean condition adapts to the problem shaping how the search space shrinks 
Now in my words
  the boolean condition adapts to the condition like whether it is a condition if it is 
  greater than or equal to less than or equal to just greater than or just equal to or just
  anything

found out one cool analogy from binary search even 
 
tried solving bs peak element II on 1st april and got problem there 
  class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for(i=0;i<mat.length;i++){
            int start=0;
            int end=mat[i].length-1;
                int mid=start+(end-start)/2;
                if(mat[i][mid]<mat[i][mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
    }
}
on 2 april i did this again 
tried doing dry run of half code 
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
        int end=m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int maxrow=0;
            for(int i=1;i<r;i++){
                if(mat[i][maxrow]>mat[i][maxrow+1])
            }
        }

    }
}

on 10 th july i stuck on thsi question for the k<0 part 

  class Solution {
    public int[] decrypt(int[] code, int k) {
        int []arr=new int[code.length];
        int sum=0;
        for(int i=0;i<code.length*2;i++){
            sum=sum+code[i % code.length];
            if(k>0){
                if(i==k){
                    sum=sum-code[i-k];
                    arr[i-k]=sum;
                }
                else if(i>k){
                    sum=sum-code[i-k];
                    arr[i-k]=sum;
                }
            }
            else if (k < 0) {

            }
            else{
                return arr;
            }
        }
        return new int[]{};
    }
}
