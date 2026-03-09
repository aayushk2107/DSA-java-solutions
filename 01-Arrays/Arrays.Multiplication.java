// Solved multiplication of each elemnet on an array
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int[] ans=multiply(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] multiply(int []nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*2;
        }
        return nums;
    }
}