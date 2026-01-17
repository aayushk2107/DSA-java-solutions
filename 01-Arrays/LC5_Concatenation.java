//Q. Concatenation of an array
import java.util.Arrays;
public class Concatenation{
    public static void main(String[]args){
        int []arr={1,2,3};
        int []an=hello(arr);
        System.out.println(Arrays.toString(an));
    }
    static int[] hello(int []arr){
        if(arr.length==0){
            return new int[]{-1};
        }
        int n=arr.length;
        int []ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        for(int i=n;i<2*n;i++){
            ans[i]=arr[i-n];
        }
        return ans;
    }
}