class Solution {
    public String reverseWords(String s) {
        char ws = ' ';
        int i = 0;
        int end = 0;
        int start = 0;
        char [] arr = s.toCharArray();
        int j = i;
        while(i < arr.length){
                start = i;
            while(i < arr.length && j < arr.length && arr[j] != ws){
                j++;
                i++;
            }
            end = j - 1;
            while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            j++;
            i++;
        }
        String ans = new String(arr);
        return ans;
    }
}