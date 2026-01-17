//Q. Reverse a 2Darray using 2 pointer approach
import java.util.Arrays;
public class TwoDArrayReversal{
    public static void main(String[]args){
        int [][]arr={
            {12,23},
            {32,43,54,65},
            {87,90,56}
        };
        arrayReversing(arr);
    }
    static void arrayReversing(int [][]arr){
        for(int i=0;i<arr.length;i++){
                int start=0;
                int end=arr[i].length-1;
                while(start<end){
                    int temp=arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end]=temp;
                    start++;
                    end--;
                }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
