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
}
