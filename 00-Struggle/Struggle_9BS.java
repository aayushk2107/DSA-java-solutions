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
