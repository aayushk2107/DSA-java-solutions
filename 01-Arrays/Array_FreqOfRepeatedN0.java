/*Given an integer array and a target value x, return how many times x occurs in the array.
arr = [1, 2, 3, 2, 2, 4]
x = 2
Output: 3

*/
public class Main{
    public static void main(String[]args){
        int []arr={1, 2, 3, 2, 2, 4};
        int i=2;
        int ans=hello(arr,i);
        System.out.println(ans);
    }
    static int hello(int []nums,int k){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                sum++;
            }
        }
        return sum;
    }
}