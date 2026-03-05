//revised even count leetcode question
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,34,56,9};
        int ans=numberCount(arr);
        System.out.println(ans);
    }
    static int numberCount(int []nums){
        if(nums.length==0){
            return -1;
        }
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            int digitcount=0;
            int element=nums[i];
            while(element>0){
                element=element/10;
                digitcount++;
            }
            if(digitcount%2==0){
                evencount++;
            }
        }
        return evencount;
    }
}
