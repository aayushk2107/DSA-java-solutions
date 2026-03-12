import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int ans=magic23(arr);
        System.out.println(ans);
    }
    static int magic23(int []nums){
        if(nums.length==0){
            return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%nums[i]== 0 && nums[i]%1==0){
                nums[i]=0;
                sum++;
            }
        }
        return sum;
    }
}
