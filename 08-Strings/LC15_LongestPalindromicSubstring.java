class Solution {
    public String longestPalindrome(String s) {
        int beststart = 0;
        int bestend = 0;
        for(int i = 0;i < s.length();i++){
            int start = i;
            int end = i;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            
            start++;
            end--;

            int left = i;
            int right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            left++;
            right--;

            if (end - start + 1 > bestend - beststart + 1){
                beststart = start;
                bestend = end;
            }

            if (right - left + 1 > bestend - beststart + 1){
                beststart = left;
                bestend = right;
            }
        }
        return s.substring(beststart,bestend + 1);
    }
}