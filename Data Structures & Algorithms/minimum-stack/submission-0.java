class MinStack {
    
    Stack<Integer> newstack;
    Stack<Integer> minstack;

    public MinStack() {
        newstack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        newstack.push(val);
        
        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            if(val < minstack.peek()){
                minstack.push(val);
            }else{
                minstack.push(minstack.peek());
            }
        }
    }
    
    public void pop() {
        newstack.pop();
        minstack.pop();
    }
    
    public int top() {
        return newstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
