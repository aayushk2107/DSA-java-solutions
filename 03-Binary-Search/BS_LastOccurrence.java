public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,3,3,3,3,4,5};
        System.out.println(lastOccurrence(arr,3));
    }
    static int lastOccurrence(int []nums,int target){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return  end;
    }
}