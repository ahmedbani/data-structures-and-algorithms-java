package linked.list;

public class Node<T> {
    Node nextNode ;
    T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
