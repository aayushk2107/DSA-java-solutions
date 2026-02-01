//Q. Solved reversing an array using converging two pointers
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={12,3,4,5,6,7};
        reverse(arr);
    }
    static void reverse(int []nums){
        if(nums.length==0){
            return;
        }
        int end=nums.length-1;
        for(int i=0;i<end;i++){
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end]=temp;
            end--;
        }
        System.out.println(Arrays.toString(nums));
        
    }
}