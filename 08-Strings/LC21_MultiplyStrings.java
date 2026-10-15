class Solution {
    public String multiply(String num1, String num2) {
        long number1 = 0;
        long number2 = 0;
        for(int i = 0;i < num1.length(); i++){
            int digit = (num1.charAt(i) - '0');
            number1 = number1 * 10 + digit;
        }
        for(int j = 0; j < num2.length(); j++){
            int digit = (num2.charAt(j) - '0');
            number2 = number2 * 10 + digit;
        }
        long length = 0;
        int order = 0;
        if(number1 <= number2){
            length = number1;
            order = 1;
        }
        else{
            length = number2;
            order = 2;
        }
        long accumulated = 0;
        for(int i = 0; i < length; i++){
            if(order == 1){
                accumulated += number2;
            }
            else{
                accumulated += number1;
            }
        }
        long countNumber = accumulated;
        int length1 = 0;
        String ans = new String();
        while(countNumber > 0){
            int digit = (int)(countNumber % 10);
            countNumber = countNumber / 10;
            char digit1 = (char)(digit + '0');
            ans += digit1;
        }
        char [] s = ans.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        String ans1 = new String(s);
        return ans1;
    }
}