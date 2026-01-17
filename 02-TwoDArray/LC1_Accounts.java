//Q. consider each rows as persons and the elements inside them as the amount of money they have in specific bank accounts return the maximum wealth of the person 
public class Accounts{
    public static void main(String[]args){
        int [][]arr={
            {12,23,43},
            {54,65,76},
            {77,97,101}
        };
        System.out.println(accounts(arr));
    }
    static int accounts(int [][]arr){
        if(arr.length==0){
            return -1;
        }
        int maxwealth=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>maxwealth){
                maxwealth=sum;
            }
        }
        return maxwealth;
    }
}
