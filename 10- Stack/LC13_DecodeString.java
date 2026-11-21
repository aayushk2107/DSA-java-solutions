class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<StringBuilder> s2 = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        char [] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isDigit(arr[i])){
                int digit = s.charAt(i) - '0';
                num = num * 10 + digit;
            }
            else if(arr[i] == '['){
                s1.push(num);
                num = 0;
                s2.push(curr);
                curr = new StringBuilder();
            }
            else if(arr[i] == ']'){
                int digit = s1.pop();
                StringBuilder ans = s2.pop();
                for(int j = 0; j < digit; j++){
                    ans.append(curr);
                }
                curr = ans;
            }
            else{
                curr.append(arr[i]);
            }
        }
        return curr.toString();
    }
}