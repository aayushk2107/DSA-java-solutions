class StockSpanner {
    Stack<int []> s1;
    public StockSpanner() {
        s1 = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!s1.isEmpty() && s1.peek()[0] <= price){
            count += s1.peek()[1];
            s1.pop();
        }
        s1.push(new int[]{price , count});
        return s1.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */