APPROACH 1 - THIS IS COMPLETELY VALID APPROACH JUST JUGGLING WITH THE TERRIBLE QUESTION DEMAND
    
    THE APPROACH IS MULTIPLICATION IS ADDITION AT EACH STEP ONLY SO I CONVERTED BOTH THE STRING INTO NUMBER AND THEN RAN IT OVER A NUMBER AND
    ADDED IT OVER THAT MUCH TIMES EQUIVALENT TO ONE OF THE NUMBERS AND THEN AGAIN COVERTED THE ENTIRE NUMBER INTO STRING AND RETURN 

    GOT DEFINITELY STUCK IN THE IMPLEMENTATION PHASE BUT THE LOGIC IS COMPLETELY UNBREAKABLE FROM THE VERY START
    
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

APPROACH 2 
    
NEED REVISON 
    
    class Solution {
    public String multiply(String num1, String num2) {
        int [] arr = new int[num1.length() + num2.length()];
        int position1 = 0;
        int position2 = 0;
        int carry = 0;
        for(int i = num2.length() - 1; i >= 0; i--){
            int digit1 = (num2.charAt(i) - '0');
            carry = 0;
            for(int j = num1.length() - 1; j >= 0; j--){
                position1 = i + j;
                position2 = i + j + 1;
                int digit2 = (num1.charAt(j) - '0');
                int sum = digit1 * digit2;
                int keep = arr[position2] + sum + carry;
                int insert = keep % 10;
                arr[position2] = insert;
                carry = keep / 10;
            }
            arr[i] += carry;
        }
        StringBuilder ans = new StringBuilder();
        int number = 0;
        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i] == 0 && ans.length() == 0){
                continue;
            }
            else{
                char digit = (char)(arr[i] + '0');
                ans.append(digit);
            }
        }
        if(num2.length() == 1 || num1.length() == 1){
            if(num1.charAt(0) == '0' || num2.charAt(0) == '0'){
                return "0";
            }
        }
        return ans.toString();
    }
}
