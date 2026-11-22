class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        int i = 1;
        s1.push(s.charAt(0));
        while(i < s.length()){
            if(!s1.isEmpty() && s.charAt(i) == s1.peek()){
                s1.pop();
                i++;
                continue;
            }
            s1.push(s.charAt(i));
            i++;
        }
        StringBuilder ans = new StringBuilder();
        while(!s1.isEmpty()){
            char ch = s1.pop();
            ans.append(ch);
        }
        String an = new String(ans);
        char [] arr = an.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String a = new String(arr);
        return a;
    }
}