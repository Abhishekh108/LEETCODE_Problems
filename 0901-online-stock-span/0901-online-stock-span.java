class StockSpanner {
    Stack<int []> stack;
    public StockSpanner() {
        stack= new Stack<>();
    }
    
    public int next(int price) {
        int spam=1;
        //<price, spam>
        while(!stack.isEmpty() && stack.peek()[0]<=price){ //when the price is less the nor equal to
            spam+=stack.pop()[1];
        }

        stack.push( new int[]{price,spam});
        return spam;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna