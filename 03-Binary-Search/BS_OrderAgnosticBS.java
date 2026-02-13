//Order Agnostic Binary Search
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6};
        int ans=orderAgnosticBS(arr,6);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[start]<nums[end]){
                if(nums[mid]<target){
                    start=mid+1;
                }
                else if(nums[mid]>target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            else{
                if(nums[mid]<target){
                    end=mid-1;
                }
                else if(nums[mid]>target){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}