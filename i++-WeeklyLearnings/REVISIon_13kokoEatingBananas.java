public class Main{
    public static void main(String[]args){
        int []arr={4,6,7,11};
        System.out.println(pilez(arr,3));
    }
    static int pilez(int []piles,int h){
        if(piles.length==0){
            return -1;
        }
        int start=1;
        int end=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>end){
                end=piles[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(minimumK(piles,h,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static boolean minimumK(int []nums,int h,int k){
        int hour=0;
        for(int i=0;i<nums.length;i++){
            hour=hour+nums[i]/k;
            if(nums[i]%k!=0){
                hour++;
            }
        }
        return hour<=h;
    }
}

on 5th june i did this

    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>end){
                end=piles[i];
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(kSpeed(piles,h,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public boolean kSpeed(int []nums,int h,int k){
        long hours=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % k == 0){
                hours=hours+nums[i]/k;
            }
            else if(nums[i]>k){
                hours=hours+nums[i]/k+1;
            }
            else{
                hours=hours+1;
            }
        }
        return hours<=h;
    }
}
