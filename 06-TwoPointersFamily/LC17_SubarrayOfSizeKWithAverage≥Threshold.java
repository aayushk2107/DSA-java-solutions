class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int validSubarrays=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i==k-1){
                int average=sum/k;
                if(average>=threshold){
                    validSubarrays++;
                }
            }
            if(i>k-1){
                sum-=arr[i-k];
                int average=sum/k;
                if(average>=threshold){
                    validSubarrays++;
                }
            }
        }
        return validSubarrays;
    }
}