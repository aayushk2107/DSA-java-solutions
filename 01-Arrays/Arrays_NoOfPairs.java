//Q. Return the pairs itself rather than the number of pairs of 
import java.util.Arrays;
import java.util.ArrayList;

public class NoOfPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        ArrayList<int[]> hell = hello(arr);
// didn't used System.out.println(Arrays.toString(arr) ; instead of enhanced for loop cause normal toString prints refrences instead of values why cause toString works for primitive arrays and object arrays and  hell is a collection not an array and pair in the enhanced for loop is an int so yeah it ran 
        for (int[] pair : hell) {
            System.out.println(Arrays.toString(pair));
        }
    }

    static ArrayList<int[]> hello(int[] arr) {
        ArrayList<int[]> a1 = new ArrayList<>();
        if (arr.length == 0) {
            return a1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    a1.add(new int[]{i, j});// or i can simply do this a1.add(i);
                        //a1.add(j); if i don't write this ArrayList<int[]> instead of this ArrayList<Integer> 
                }
            }
        }
        return a1;
    }
}
