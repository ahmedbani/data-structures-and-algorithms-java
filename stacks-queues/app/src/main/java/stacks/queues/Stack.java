package stacks.queues;

public class Stack<T> {
    Node <T> top;

    public void push(T value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        newNode.getNext();
        top=newNode;
    }
    public T pop(){
        if(top == null)
            return (T)"the stack is empty";
        else {
            Node temp = top;
            top = top.getNext();
            temp.setNext(null);
            return (T) temp.getValue();
        }
    }
    public T peek(){
        if(top == null)
            return (T)"the stack is empty";
        else {
            return (T) top.getValue();
        }
    }
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public String toString() {
        String result = "";
        Node now = top ;
        while (now != null){
            result += "{ " + now.getValue() + " } -> ";
            now = now.getNext() ;
        }
        result += "NULL";
        return result;
    }

}
