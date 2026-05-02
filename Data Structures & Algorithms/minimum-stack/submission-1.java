class MinStack {

    Stack<Integer> normStack;
    Stack<Integer> minStack;
    public MinStack() {

        normStack = new Stack<>();
        minStack = new Stack<>();
      
        
    }
    
    public void push(int val) {
        normStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {

        int rem = normStack.pop();
        if(rem == minStack.peek()){
            minStack.pop();
        }

        
    }
    
    public int top() {
        return normStack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
