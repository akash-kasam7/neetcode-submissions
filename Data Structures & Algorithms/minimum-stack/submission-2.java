class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> mst;
    public MinStack() {
        st=new Stack<>();
        mst=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(mst.isEmpty() || val<=mst.peek()){
            mst.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        if(mst.peek().equals(st.pop())){
            mst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}
