class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();
        int i = 0;
        while(i < tokens.length){
            boolean permit = false;
            if(tokens[i].equals("/")){
                permit = true;
            }
            else if(tokens[i].equals("*")){
                permit = true;
            }
            else if(tokens[i].equals("+")){
                permit = true;
            }
            else if(tokens[i].equals("-")){
                permit = true;
            }
            else{
                int number = Integer.parseInt(tokens[i]);
                s1.push(number);
            }
            while(!s1.isEmpty() && permit == true){
                int element = s1.pop();
                if(tokens[i].equals("/")){
                    int value = s1.peek() / element;
                    s1.pop();
                    s1.push(value);
                }
                else if(tokens[i].equals("*")){
                    int value = s1.peek() * element;
                    s1.pop();
                    s1.push(value);
                }
                else if(tokens[i].equals("+")){
                    int value = s1.peek() + element;
                    s1.pop();
                    s1.push(value);
                    
                }
                else if(tokens[i].equals("-")){
                    int value = s1.peek() - element;
                    s1.pop();
                    s1.push(value);
                }
                break;
            }
            i++;
        }
        return s1.peek();
    }
}