class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i=0;i < word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch) == true){
                count++;
            }
        }
        if(word.length() == count){
            return true;
        }
        if(count == 0){
            return true;
        }
        char ch = word.charAt(0);
        if(count == 1 && Character.isUpperCase(ch) == true){
            return true;
        }
        return false;
    }
}