class MyStack {

    Queue<Integer> q;
    Queue<Integer> temp;
    public MyStack() {
        q = new LinkedList<>();
        temp = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        while(q.size()>1){
            temp.add(q.remove());
        }
        int res = q.remove();
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
        return res;
    }
    
    public int top() {
         if(q.isEmpty()) return -1;
        while(q.size()>1){
            temp.add(q.remove());
        }
        int res = q.peek();
        temp.add(q.remove());
        while(!temp.isEmpty()){
            q.add(temp.remove());
        }
        return res;
    }
    
    public boolean empty() {
        return q.isEmpty();
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