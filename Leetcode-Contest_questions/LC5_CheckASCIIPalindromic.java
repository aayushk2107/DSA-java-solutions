

class Solution {
    public boolean isPalindromic(String s) {
        String ans = "";
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            String bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            ans += bits;
        }
        int start = 0;
        int end = ans.length()-1;
        while(start<end){
            if(ans.charAt(start) != ans.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}