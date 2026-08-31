class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char ans = ' ';
        for(int i = s.length() - 1;i >= 0;i--){
            if(s.charAt(i) == ans && count == 0){
                continue;
            }
            if(s.charAt(i) != ans && count >= 0){
                count++;
                if(i != 0){
                    if(s.charAt(i - 1) == ans){
                        break;
                    }
                }
            }
        }
        return count;
    }
}