class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDigitRange=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int maxDigit=0;
            int smallDigit=Integer.MAX_VALUE;
            int num=nums[i];
            while(num>0){
                int digit=num%10;
                if(digit>maxDigit){
                    maxDigit=digit;
                }
                if(digit<smallDigit){
                    smallDigit=digit;
                }
                num=num/10;
            }
            int digitRange=maxDigit-smallDigit;
            if(digitRange>maxDigitRange){
                maxDigitRange=digitRange;
                sum=nums[i];
            }
            else if(digitRange==maxDigitRange){
                sum+=nums[i];
            }
        }
        return sum;
    }
}