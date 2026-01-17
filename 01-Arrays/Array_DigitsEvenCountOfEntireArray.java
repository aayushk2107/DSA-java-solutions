//Q. Return the digits of evennumbers existing in the array using the approach to first convert the array into String class
public class DigitsEvenCountOfEntireArray{
    public static void main(String[]args){
        int []arr={12,23,34,455,67,8876,986};
        System.out.println(digitCount(arr));
    }
    static int digitCount(int []arr){
        if(arr.length==0){
            return -1;
    }
    int evencount=0;
    for(int i=0;i<arr.length;i++){
        String s=Integer.toString(arr[i]);
        if(s.length()%2==0){
            evencount++;
        }
    }
    return evencount;
    }
}
