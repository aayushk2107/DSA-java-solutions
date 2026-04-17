public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,6,6,6,6};
        int target=6;
        System.out.println(firstOccurrence(arr,target));
    }
    static int firstOccurrence(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}