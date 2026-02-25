//Revised permutation on 25 at 11:22 pm
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={1,4,5,2,3,0};
        int []ans=permutation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] permutation(int []nums){
        int []ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}