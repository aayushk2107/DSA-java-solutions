class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 1){
            return 1;
        }
        
        int validsubstrings = 0;

        for(int i = 0; i < s.length(); i++){
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

            if(start != i && end != i){
                validsubstrings += i - start;
            }

            if(left == i && right == i + 1 && s.charAt(left) == s.charAt(right)){
                validsubstrings += 1;
            }
            else if(left != i && right != i + 1){
                validsubstrings += (i + 1) - left;
            }
        }
        validsubstrings += s.length();
        return validsubstrings;
    }
}