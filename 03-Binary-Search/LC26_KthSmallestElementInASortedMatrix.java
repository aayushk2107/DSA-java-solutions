class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows=matrix.length-1;
        int cols=matrix[rows].length-1;
        int start=matrix[0][0];
        int end=matrix[rows][cols];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(validator(matrix,k,mid)){
                start=mid+1; 
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    public boolean validator(int [][]nums,int k,int mid){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]<=mid){
                    count++;
                }
            }
        }
        return count<k;
    }
}