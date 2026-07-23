class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int globalLength=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int length=0;
        for(int i=0;i<nums.length;i++){
            if(sum<target){
                sum=sum+nums[i];
                length++;
            }
            while(sum>=target){
                if(length<globalLength){
                    globalLength=length;
                }
                sum=sum-nums[left];
                left++;
                length--;
            }
        }
        if(globalLength==Integer.MAX_VALUE){
            return 0;
        }
        return globalLength;
    }
}

AAPROACH 2
    
    USING BS ON ANSWER AND FIXED SIZE SLIDING WINDOW 

    
    class Solution {
    public int minSubArrayLen(int target,int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(validator(mid,target,nums)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(start>nums.length){
            return 0;
        }
        return start;
    }

    public boolean validator(int mid,int tar,int[] arr){
        int sum=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            if(i<=mid-1){
                sum+=arr[i];
            }
            else{
                sum+=arr[i];
                sum-=arr[left];
                left++;
            }
            if(sum>=tar){
                return true;
            }
        }
        return false;
    }
}
