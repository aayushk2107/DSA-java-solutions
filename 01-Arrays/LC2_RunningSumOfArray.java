//Q. Running sum of 1d array
import java.util.Arrays;
public class RunningSumOfArray{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6};
        int []an=sum(arr);
        System.out.println(Arrays.toString(an));
    }
    static int[] sum(int []arr){
        if(arr.length==0){
            return new int[]{-1};
        }
        int sum=0;
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            ans[i]=sum;
        }
        return ans;
    }
}
