Approach 1 - SIMPLE BRUTE FORCE

class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                }
                sum += min;
            }
        }
        return (int)(sum % 1000000007);
    }
}
