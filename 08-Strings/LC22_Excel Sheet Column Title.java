class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i = 0 ; i < 26; i++){
            map.put(i , (char)('A' + i));
        }
        StringBuilder ans = new StringBuilder();
        while(columnNumber > 0){
            int digit = columnNumber - 1;
            int number = digit % 26;
            ans.append(map.get(number));
            columnNumber--;
            columnNumber /= 26;
        }
        int left = 0;
        int right = ans.length() - 1;
        while(left < right){
            char ch = ans.charAt(left);  
            char ch2 = ans.charAt(right);  
            ans.setCharAt(left,ch2);
            ans.setCharAt(right,ch);
            left++;
            right--;
        }
        return ans.toString();
    }
}