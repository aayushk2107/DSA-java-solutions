//Q. return how many numbers are having evendigits in the 2D array?
public class Main{
    public static void main(String[]args){
        int [][]arr={
            {12,23,34},
            {45,56,67},
            {78,89}
            };
         System.out.println(count(arr));
    }
    static int count(int [][]arr){
        int evencount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int element=arr[i][j];
                int digitcount=0;
                while(element>0){
                    element=element/10;
                    digitcount++;
                }
                if(digitcount%2==0){
                    evencount++;
                }
            }
            }
        return evencount;
    }
}