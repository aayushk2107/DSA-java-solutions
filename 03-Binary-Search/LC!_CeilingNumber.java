//Q. Ceiling of a number means any number which is closest to the target element but it should be greater than or equal to it
import java.util.Scanner;
public class CeilingNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr={12,23,34,45,56,67,78,89,90};
        System.out.println("Write down your target here:");
        int target=sc.nextInt();
        System.out.println(ceilingBS(arr,target));
    }
    static int ceilingBS(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        int candidate=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                candidate=arr[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return candidate;
    }
}
