/* Solved Simple Binary Search*/


public class Main{
    public static void main(String[]args){
        int []arr={12,13,14,15,16,17,18};
        int hello=bS(arr,15);
        System.out.println(hello);
    }
    static int bS(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}