class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                if(isPalindrome(s,start,end) == true){
                    return true;
                }
                else{
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }
    private boolean isPalindrome(String s,int start,int end){
        int start1 = start;
        int end1 = end;
        int count = 1;
        int allow = 0;
        start += 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end) && count == 1){
                start = start1;
                end = end1;
                end -= 1;
                count += 2;
                allow = 1;
            }
            else if(s.charAt(start) != s.charAt(end) && count >= 3){
                return false;
            }
            if(allow != 1){
                start++;
                end--;
            }
            allow++;
        }
        return true;
    }
}