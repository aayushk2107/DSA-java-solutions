//Q. Given an integer array return the count of numbers in the array that contains an even number of digits.
public class ArrayEvenCount{
    public static void main(String[]args){
        int []arr={12,23,34,45,56,67,78,89,90,113};
        System.out.println(count(arr));
    }
    static int count(int []arr){
        if(arr.length==0){
            return -1;
        }
        int evencount=0;
        for(int i=0;i<arr.length;i++){
            int digitcount=0;
            int element=arr[i];
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
