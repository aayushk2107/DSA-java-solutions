/*
Made one wrong code where i have to find the peak first occurrence and the question guarantees that only peak duplicates exists and i have to find the first index from where the peak starts
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
    int peak=start;
    int peak1=nums[start];
    int start1=0;
    int end1=peak;
    while(start1<end1){
        int mid=start1+(end1-start1)/2;
        if(nums[mid]>=peak1){
          end=mid-1;
        }
        else{
          start=mid+1;
        }
    }
     return start1;
    }
}