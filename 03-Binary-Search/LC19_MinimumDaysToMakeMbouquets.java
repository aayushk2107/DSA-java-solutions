class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }
        int start=bloomDay[0];
        int end=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i]<start){
                start=bloomDay[i];
            }
            if(end<bloomDay[i]){
                end=bloomDay[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(checksOut(bloomDay,m,k,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public boolean checksOut(int []nums,int m,int k,int days){
        int currentM = 0;
        int currentK = 0;

        for(int i=0; i<nums.length;i++) {

            if(nums[i]<=days){
                currentK++;

                if(currentK==k){
                    currentM++;
                    currentK=0;

                    if(currentM>=m){
                        return true;
                    }
                }
            } 
            else {
                currentK = 0;
            }
        }
        return false;
    }
}