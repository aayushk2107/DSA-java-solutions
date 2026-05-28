class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        int []arr=new arr[x];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid<=x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}
class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid<=x && mid*mid<=Integer.MAX_VALUE){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
}

my wrong attempt on koko eating bananas on 28th may

    
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int start=1;
         int end=piles[0];
         for(int i=1;i<piles.length;i++){
            if(end<piles[i]){
                end=piles[i];
         }
         while(start<end){
            int mid=start+(end-start)/2;
            if(hoursEstimation(piles,h,mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
         }
         return start;
    }
    public boolean hoursE(int []piles,int h,int k){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours=hours+(piles[i]+k-1)/k;
        }
        return hours<=h;
    }
}
