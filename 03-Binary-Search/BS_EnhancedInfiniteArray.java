/*ATTEMPT -1
My attempt to the amazon question with a little twist with negative numbers*/

public class Main{
    public static void main(String[]args){
        int []arr={-15,-14,-13,-12,-11,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        int ans1=ans(arr,-11);
        System.out.println(ans1);
    }
    static int ans(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=1;
        while(nums[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}


/*ATTEMPT - 2
Enhancing the trick by reversing the array order of elements into non-increasing*/

public class Main{
    public static void main(String[]args){
        int []arr={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        int ans1=ans(arr,11);
        System.out.println(ans1);
    }
    static int ans(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=1;
        while(nums[end]>target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
