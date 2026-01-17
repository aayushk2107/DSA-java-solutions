//Q. Return the number of digits that a particular number contains in the array
public class DigitsCountOfANumber{
    public static void main(String[]args){
        int []arr={12,23,34,45,56,67,78,89,90,113};
        System.out.println(count(arr[3]));
    }
    static int count(int arr){
        String s=Integer.toString(arr);
        return s.length();
    }
}
