import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3};
        int [] ans=concatenation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] concatenation(int []nums){
        int []ans=new int[nums.length+nums.length];
        for(int i=0;i<3;i++){
            ans[i]=nums[i];
        }
        //Leart or recalled onr most important thing whcih is like in what array we have to modify we put
        //exactly only that array length in the loop definition
        for(int i=3;i<ans.length;i++){
            ans[i]=nums[i-3];
        }
        return ans;
    }
}
