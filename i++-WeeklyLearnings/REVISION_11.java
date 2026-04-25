/*
this code needs some fixing 
*/
public class Main{
    public static void main(String[]args){
        int []arr={1, 2, 4, 4, 4, 3, 2};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                end--;
            }
        }
        int index=start;
        int peak=nums[start];
        int start1=0;
        int end1=index;
        while(start1<=end1){
            int mid=start1+(end1-start1)/2;
            if(nums[mid]<=peak){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start1;
    }
}