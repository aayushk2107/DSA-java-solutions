class MinStack {
    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(new int[]{value,value});
        }
        else{
            int newMin = value;
            if(newMin > stack.peek()[1]){
                newMin = stack.peek()[1];
            }
            stack.push(new int[]{value,newMin});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */