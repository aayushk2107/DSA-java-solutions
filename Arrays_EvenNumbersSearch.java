//Finding even numbers in the array
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6};
        int ans=evenNumberSearch(arr);
        System.out.println(ans);
    }
    static int evenNumberSearch(int []nums){
        if(nums.length==0){
            return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum++;
            }
        }
        return sum;
    }
}
