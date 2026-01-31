/*My first wrong code while attempting to solve kth smallest element
Mistake i did is confused and applied a pattern of max element in array onto kth smallest
why this is a good mistake cause i myself produced the two loop where first loop will run k times 
and the inner loop will contine finding the kth smallest where i tripped a little but i am happy 
to find the logic by myself
*/
public class Main{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        System.out.println(kthsmall(arr,3));
    }
    static int kthsmall(int []arr,int k){
        if(arr.length==0){
            return -1;
        }
        int kthsmall=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            for(int j=0;j<arr.length;j++){
                if(kthsmall>arr[j]){
                    kthsmall=arr[j];
                }
            }
        }
        return kthsmall;
    }
}