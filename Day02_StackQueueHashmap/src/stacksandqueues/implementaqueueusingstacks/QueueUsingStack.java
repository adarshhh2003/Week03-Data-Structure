package stacksandqueues.implementaqueueusingstacks;

import java.util.Stack;

public class QueueUsingStack {
    //Creating two stack
    private Stack<Integer>stack1;
    private Stack<Integer>stack2;
   //constructor
    public QueueUsingStack(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        //Check if stack is empty
        if(stack2.empty()){
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }
}
