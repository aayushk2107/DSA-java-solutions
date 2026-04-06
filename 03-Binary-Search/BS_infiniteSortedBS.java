/* AMAZON question of finding the element in infinite sorted array in non decreasing order*/


public class Main{
    public static void main(String[]args){
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int ans=infiniteSortedBS(arr,10);
        System.out.println(ans);
    }
    static int infiniteSortedBS(int []nums,int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1; 
            end=end+(end-start+1)*2;
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
