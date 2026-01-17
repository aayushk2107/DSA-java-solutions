//Q.Build a new array from permutation 
import java.util.Arrays;
public class Permutation{
    public static void main(String[]args){
        int []arr={1,4,5,2,3,0};
        int []an=permutation(arr);
        System.out.println(Arrays.toString(an));
    }
    static int []permutation(int []arr){
        if(arr.length==0){
            return new int[]{-1};
        }
        int []ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
