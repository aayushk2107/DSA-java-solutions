on 11th may i did this

public class Main{
    public static void main(String[]args){
        int []arr={7,8,9,2,3,4,5,6};
        System.out.println(minInRotatedSortedArray(arr));
    }
    static int minInRotatedSortedArray(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[start];
    }
}
on 12th may i solved this

public class Main{
    public static void main(String[]args){
        int []arr={5,5,5,6,7,2,3,4};
        System.out.println(minInRotatedSortedArray(arr));
    }
    static int minInRotatedSortedArray(int []nums){
        if(nums.length==0){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[end]){
                end--;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return nums[end];
    }
}
