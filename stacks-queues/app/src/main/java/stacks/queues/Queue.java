package stacks.queues;

public class Queue<T> {

    Node <T> front;
    Node <T> back;

    public void enqueue(T value){
        Node newNode = new Node(value);
        if (front == null){
            front = newNode;
        }
        else {
            back.setNext(newNode);
        }
        back = newNode;
    }
    public T dequeue(){
        if(front==null)
            return (T)"the queue is empty";
        else {
            Node temp = front;
            front = front.getNext();
            temp.setNext(null);
            return (T) temp.getValue();
        }
    }
    public T peek(){
        if(front==null)
            return (T)"the queue is empty";
        else {
            return front.getValue();
        }
    }
    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        String result = "";
        Node now = front ;
        while (now != null){
            result += "{ " + now.getValue() + " } -> ";
            now = now.getNext() ;
        }

        result += "NULL";
        return result;
    }
}
