/*
The standard invariant is:

At the start of iteration i, the subarray nums[0...i] is already sorted.

Then the algorithm does:

Take nums[i+1]
↓
Insert it into its correct position inside nums[0...i]
↓
Now nums[0...i+1] is sorted
*/




import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        int []arr={5,2,2,3,1,4};
        int []ans=hello(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] hello(int []nums){
        if(nums.length==0){
            return new int[]{-1};
        }
        for(int i=0;i<=nums.length-2;i++){
            int element=nums[i];
            for(int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        return nums;
    }
}

