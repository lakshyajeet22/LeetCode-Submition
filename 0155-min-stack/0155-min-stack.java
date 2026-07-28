class MinStack {
    Stack<Integer> st;
    Stack<Integer> s;

    public MinStack() {
        st = new Stack<>();
        s=new Stack<>();
        
    }
    
    public void push(int value) {
        if(s.isEmpty() || s.peek()>=value){
            s.push(value);  
        }
        st.push(value);
    }
    
    public void pop() {
        if(st.peek().equals(s.peek())){
            s.pop(); 
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return s.peek();
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