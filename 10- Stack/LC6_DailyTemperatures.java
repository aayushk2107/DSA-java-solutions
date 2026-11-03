class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] ans = new int[n];
        Stack<Integer> s1 = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s1.isEmpty() && temperatures[s1.peek()] < temperatures[i]){
                ans[s1.peek()] = i - s1.peek();
                s1.pop();
            }
            s1.push(i); 
        }
        return ans;
    }
}