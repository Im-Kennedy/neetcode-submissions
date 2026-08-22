class MyStack {

    Queue<Integer> stack1;

    public MyStack() {
        stack1 = new LinkedList<>();
    }
    
    public void push(int x) {
        stack1.offer(x);
        int size = stack1.size() - 1;
        for(int i = 0; i < size; i++){
            stack1.offer(stack1.poll());
        }      
    }
    
    public int pop() {
        return stack1.poll();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public boolean empty() {
        if(stack1.size() == 0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */