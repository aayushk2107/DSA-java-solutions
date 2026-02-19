//floor problem of BS floor is something which is the smallest number which is equal to or lesser than the target
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,8,15,18,19,22,24,27};
        int ans=floorBS(arr,7);
        System.out.println(ans);
    }
    static int floorBS(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        int floor=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                floor=nums[mid];
                start=mid+1;
            }
            else{
                 end=mid-1;
            }
        }
        return floor;
    }
}