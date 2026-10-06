class Solution {
    public int matrixSum(int[][] nums) {
        for(int i = 0;i < nums.length;i++){
            Arrays.sort(nums[i]);
        }
        int score = 0;
        int largest = 0;
        int j = 0;
        while(j < nums[0].length){
            int maximum = 0;
            int i = 0;
            while(i < nums.length && j < nums[0].length){
                if(nums[i][j] > maximum){
                    maximum = nums[i][j];
                }
                i++;
            }
            j++;
            if(largest < maximum){
                largest = maximum;
            }
            score += largest;
        }
        return score;
    }
}