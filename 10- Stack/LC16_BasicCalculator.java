Wrong Code Which Passes 31 / 49 TestCases It's mine no Milawat

class Solution {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int i = 0;
        int sum = 0;
        while(i < s.length()){
            while(i < s.length() && s.charAt(i) == ' '){
                i++;
            }
            if(i < s.length() && s.charAt(i) == '-' || i < s.length() && s.charAt(i) == '+' || i < s.length() && Character.isDigit(s.charAt(i))){
                int number = 0;
                boolean info = false;
                if(s.charAt(i) == '-'){
                    info = true;
                    i++;
                }
                if(s.charAt(i) == '+'){
                    i++;
                }
                while(i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
                if(s.charAt(i) == '('){
                    if(info == true){
                        s2.push('-');
                        i--;
                        info = false;
                    }
                    else{
                        s2.push('+');
                        i--;
                    }
                }
                int j = i;
                while(j < s.length() && Character.isDigit(s.charAt(j))){
                    int digit = s.charAt(j) - '0';
                    number = number * 10 + digit;
                    j++;
                }
                if(j != i){
                    i = j - 1;
                }
                if(info == true){
                    sum = sum - number;
                }
                else{
                    if(number != 0){
                        sum += number;
                    }
                }
            }
            else if(i < s.length() && s.charAt(i) == '(' || i < s.length() && s.charAt(i) == ')'){
                if(s.charAt(i) == ')'){
                    char ch = ' ';
                    if(!s2.isEmpty()){
                        ch = s2.pop();
                    }
                    if(ch == '-'){
                        sum = -sum;
                    }
                    s1.push(sum);
                    sum = 0;
                }
                else{
                    if(sum != 0){
                        s1.push(sum);
                        sum = 0;
                    }
                }
            }
            i++;
        }
        if(s1.isEmpty()){
            return sum;
        }
        int sum1 = 0;
        while(!s1.isEmpty()){
            int digit = s1.pop();
            sum1 += digit;
        }
        return sum1;
    }
}

Correct Code With Help from AI 

class Solution {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int i = 0;
        int sum = 0;
        char pending = '+';                                 
        while(i < s.length()){
            while(i < s.length() && s.charAt(i) == ' '){
                i++;
            }
            if(i < s.length() && s.charAt(i) == '-' || i < s.length() && s.charAt(i) == '+' || i < s.length() && Character.isDigit(s.charAt(i))){
                int number = 0;
                boolean info = false;
                if(s.charAt(i) == '-'){
                    info = true;
                    i++;
                }
                if(s.charAt(i) == '+'){
                    i++;
                }
                while(i < s.length() && s.charAt(i) == ' '){
                    i++;
                }
                if(s.charAt(i) == '('){
                    if(info == true){
                        pending = '-';                   
                        i--;
                        info = false;
                    }
                    else{
                        pending = '+';                       
                        i--;
                    }
                }
                int j = i;
                while(j < s.length() && Character.isDigit(s.charAt(j))){
                    int digit = s.charAt(j) - '0';
                    number = number * 10 + digit;
                    j++;
                }
                if(j != i){
                    i = j - 1;
                }
                if(info == true){
                    sum = sum - number;
                }
                else{
                    if(number != 0){
                        sum += number;
                    }
                }
            }
            else if(i < s.length() && s.charAt(i) == '(' || i < s.length() && s.charAt(i) == ')'){
                if(s.charAt(i) == ')'){
                    char ch = ' ';
                    if(!s2.isEmpty()){
                        ch = s2.pop();
                    }
                    if(ch == '-'){
                        sum = -sum;
                    }
                    sum = s1.pop() + sum;             
                }
                else{
                    s1.push(sum);                            
                    s2.push(pending);                        
                    sum = 0;
                    pending = '+';                          
                }
            }
            i++;
        }
        return sum;                               
    }
}
