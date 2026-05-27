[12:11 pm, 27/05/2026] .: class Solution {
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
[12:20 pm, 27/05/2026] .: class Solution {
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
[12:23 pm, 27/05/2026] .: class Solution {
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