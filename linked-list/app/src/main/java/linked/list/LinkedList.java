package linked.list;

public class LinkedList<T> {
    Node<T> head ;


    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

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

    public T kthFromEnd(int k){
        Node current = head;
        int length = 0;
        while (current!= null){
            current = current.nextNode;
            length++;
        }
        if( k >= length){
            return (T)"the numbered passed is bigger than the linked list";
        }
        else {
            current = head;
            for (int i = 0; i < length - k - 1; i++) {
                current = current.nextNode;
            }
            return (T) current.value;
        }

    }

    public LinkedList<T> zipLists(LinkedList list1, LinkedList list2){
        LinkedList zippedList = new LinkedList();
        if (list1 == null && list2 == null) {
            return zippedList;
        }
        else if (list1 == null || list2 == null){
            return list1 == null?list2:list1;
        }
        else {
            Node current1 = list1.head;
            Node current2 = list2.head;
            Node headNode = new Node(current1.value);
            Node node = new Node(current2.value);
            headNode.nextNode = zippedList.head;
            zippedList.head = headNode;
            Node zippedListCurrent = zippedList.head;
            zippedListCurrent.nextNode = node;
            zippedListCurrent = zippedListCurrent.nextNode;
            while (current1.nextNode != null || current2.nextNode != null){

                if(current1.nextNode != null) {
                    current1 = current1.nextNode;
                    Node nodeFromList1 = new Node(current1.value);
                    zippedListCurrent.nextNode = nodeFromList1;
                    zippedListCurrent=zippedListCurrent.nextNode;
                }
                if(current2.nextNode != null) {
                    current2 = current2.nextNode;
                    Node nodeFromList2 = new Node(current2.value);
                    zippedListCurrent.nextNode = nodeFromList2;
                    zippedListCurrent=zippedListCurrent.nextNode;
                }
            }
            return zippedList;

        }
    }
}
