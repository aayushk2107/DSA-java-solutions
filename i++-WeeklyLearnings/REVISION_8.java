import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []ans=magic(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] magic(int []nums){
        int []ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            nums[i]=nums[i]+1;
            if(nums[i]%2==0){
                ans[i]=0;
            }
            else{
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}
