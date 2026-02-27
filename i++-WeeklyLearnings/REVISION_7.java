//revised ceiling question
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,5,7,11};
        int ans=ceiling(arr,5);
        System.out.println(ans);
    }
    static int ceiling(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}