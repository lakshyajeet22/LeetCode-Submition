class StockSpanner {
   
    Stack<int[]> st;
    public StockSpanner() {
        st= new Stack<>();
    }
    
    public int next(int p) {
      int s = 1;
      while(!st.isEmpty() && st.peek()[0] <= p ){
         s+=st.pop()[1];
      }
      st.push(new int[]{p, s});
      return s;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */