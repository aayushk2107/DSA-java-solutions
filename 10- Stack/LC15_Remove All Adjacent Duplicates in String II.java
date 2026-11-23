class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int []> s1 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!s1.isEmpty() && s1.peek()[0] == s.charAt(i)){
                s1.peek()[1]++;
                if(s1.peek()[1] == k){
                    s1.pop();
                }
            }
            else if(!s1.isEmpty() && s1.peek()[0] != s.charAt(i)){
                s1.push(new int[]{s.charAt(i) , 1});
            }
            else{
                s1.push(new int[]{s.charAt(i) , 1});
            }
        }
        StringBuilder sample = new StringBuilder();
        while(!s1.isEmpty()){
            int number = s1.peek()[1];
            while(number > 0){
                sample.append((char) s1.peek()[0]);
                number--;
            }
            s1.pop();
        }
        return sample.reverse().toString();
    }
}