package stacks.queues;

public class PseudoQueue<T> {
    private Stack stack1;
    private Stack stack2;

    public PseudoQueue(Stack stack1, Stack stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void setStack1(Stack stack1) {
        this.stack1 = stack1;
    }

    public void setStack2(Stack stack2) {
        this.stack2 = stack2;
    }

    public Stack getStack1() {
        return stack1;
    }

    public Stack getStack2() {
        return stack2;
    }

    public <T> void enqueue(T value){
        // Move all elements from stack1 to stack2
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack1.push(value);

        // Push everything back to stack1 to have them in the order FIFO
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }

    public T dequeue(){
        if (stack1.isEmpty())
        {
            return (T)"the queue is empty";
        }
        // it will pop from the queue in the FIFO order
        T temp = (T) stack1.peek();
        stack1.pop();
        return  temp;
    }

    @Override
    public String toString() {
        return "pseudoQueue{" + stack1 +
                '}';
    }
}
