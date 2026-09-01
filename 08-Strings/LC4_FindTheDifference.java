class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(int i = 0;i < s.length(); i++){
            sum += s.charAt(i);
        }
        int sum2 = 0;
        for(int i = 0;i < t.length(); i++){
            sum2 += t.charAt(i);
        }
        int result = sum2 - sum;
        return (char)result;
    }
}