It's Basically A Question Which Uses MOstly Implementation In Itself 

I did 99% Of The Work By Myself Just One TestCase I Was Messing Up With Which Let Me Took Help

s = " 3+5 / 2 "

Forgot to add WhiteSpace Condition After / symbol which was giving divison By Zero Error

class Solution {
    public int calculate(String s) {
        Stack<Integer> s1 = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == ' '){
                i++;
                continue;
            }
            if(ch == '+'){
                i++;
                continue;
            }
            if(ch >= '0' && ch <= '9' || ch == '-'){
                int j = 0;
                int number = 0;
                boolean info = false;
                if(ch == '-'){
                    info = true;
                    j = i + 1;
                }
                else{
                    j = i;
                }
                while(s.charAt(j) == ' '){
                    j++;
                }
                while(j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9'|| ch == ' '){
                    if(j < s.length() && s.charAt(j) == ' '){
                        j++;
                        continue;
                    }
                    char ch1 = s.charAt(j);
                    int num = ch1 - '0';
                    number = number * 10 + num;
                    j++;
                }
                if(info == true){
                    number = -number;
                    s1.push(number);
                }
                else{
                    s1.push(number);
                }
                i = j - 1;
            }
            else if(ch == '*' || ch == '/'){
                int number = s1.pop();
                boolean info = false;
                if(ch == '*'){
                    info = true;
                }
                int j = i + 1;
                while(s.charAt(j) == ' '){
                    j++;
                }
                int number1 = 0;
                while(j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9'){
                    if(j < s.length() && s.charAt(j) == ' '){
                        j++;
                        continue;
                    }     
                    char ch1 = s.charAt(j);
                    int num = ch1 - '0';
                    number1 = number1 * 10 + num;
                    j++;
                }
                i = j - 1;
                int store = 0;
                if(info == true){
                    store = number * number1;
                }
                else{
                    store = number / number1;
                }
                s1.push(store);
            }
            i++;
        }
        int sum = 0;
        while(!s1.isEmpty()){
            int expel = s1.pop();
            sum += expel;
        }
        return sum;
    }
}