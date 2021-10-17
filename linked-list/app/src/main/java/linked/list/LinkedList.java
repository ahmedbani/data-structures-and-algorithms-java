package linked.list;

public class LinkedList<T> {
    Node<T> head ;


    public void insert(T value){
        Node newNode = new Node<T>(value);
        newNode.nextNode= head;
        head = newNode;
    }
    public boolean includes(T value){
        Node now = head;
        while (now != null){
            if(now.value == value)
                return true;
            else now = now.nextNode;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        Node now = head ;
        while (now != null){
            result += "{ " + now.value + " } -> ";
            now = now.nextNode ;
        }
        result += "NULL";
        return result;
    }

    public void append(T value){
        Node newNode = new Node<T>(value);
        Node now = head;
        while (now.nextNode != null){
            now = now.nextNode;
        }
        now.nextNode = newNode;
    }

    public void insertBefore(T position, T value){
        Node newNode = new Node<T>(value);
        Node now = head;
        if(  now.value == position ) {
            newNode.nextNode = now;
            now=newNode;
            head = newNode;
        }
        else {
            while (now.nextNode.value != position) {
                now = now.nextNode;
            }
            newNode.nextNode = now.nextNode;
            now.nextNode = newNode;
        }

    }

    public void insertAfter(T position , T value){
        Node newNode = new Node<T>(value);
        Node now = head;
        while (now.value != position){
            now = now.nextNode;
        }
        newNode.nextNode = now.nextNode;
        now.nextNode = newNode ;
    }
}
