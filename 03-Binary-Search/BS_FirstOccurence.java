/*First Occurrence in Sorted Array (Basic)

Problem:
Given a sorted array arr of integers (ascending order) and a target number x, find the first index where arr[i] == x. If x is not present, return -1.
*/
public class Main{
    public static void main(String[]args){
        int []arr={1,2,2,2,3,4,5};
        int ans=firstOccurence(arr,2);
        System.out.println(ans);
    }
    static int firstOccurence(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        int candidate=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                candidate=mid;
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return candidate;
    }
}