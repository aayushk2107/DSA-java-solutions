class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack();
        if(s.length() == 1){
            return false;
        }

        char ch1 = s.charAt(0);

        if(ch1 == ')' || ch1 == '}' || ch1 == ']'){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s1.push(ch);
            }
            
            if(!s1.isEmpty()){
                if(ch == ')' && s1.peek() == '('){
                    s1.pop();
                    continue;
                }

                else if(ch == '}' && s1.peek() == '{'){
                    s1.pop();
                    continue;
                }
                
                else if(ch == ']' && s1.peek() == '['){
                    s1.pop();
                    continue;
                }
                else if(ch == ')' && s1.peek() != '('){
                    return false;
                }

                else if(ch == '}' && s1.peek() != '{'){
                    return false;
                }
                
                else if(ch == ']' && s1.peek() != '['){
                    return false;
                }
            }
            if(ch == ')' || ch == '}' || ch == ']' && s1.isEmpty() == true){
                return false;
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}