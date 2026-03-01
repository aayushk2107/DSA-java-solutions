public class Main{
    public static void main(String[]args){
        int []arr={1,2,34,23};
        int ans=runningEvenSum(arr);
        System.out.println(ans);
    }
    static int runningEvenSum(int []nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum++;
            }
        }
        return sum;
    }
}