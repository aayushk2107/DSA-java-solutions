class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        char [] arr = s.toCharArray();
        int i = arr.length - 1;
        char space = ' ';
        String ans = "";
        while(i >= 0){
            if(arr[i] == space){
                while(i >= 0 && arr[i] == space){
                    i--;
                }
            }
            int wordend = i;
            if(i < 0){
                return ans;
            }
            if(arr[i] != space){
                while(i >= 0 && arr[i] != space){
                    i--;
                }
            }
            int j = i + 1;
            while(j >= 0 && j <= wordend){
                ans += arr[j];
                j++;
            }
            ans += space;
        }
        return ans.trim();
    }
}