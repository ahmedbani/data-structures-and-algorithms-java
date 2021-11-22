package hashTable.BinaryTree;

public class BTnode <T> {
    private T data;
    private BTnode<T> right;
    private BTnode<T> left;

    public BTnode(T data){
        this.data=data;
    }

    public BTnode<T> getRight() {
        return right;
    }

    public T getData() {
        return data;
    }

    public BTnode<T> getLeft() {
        return left;
    }

    public void setRight(BTnode<T> right) {
        this.right = right;
    }

    public void setLeft(BTnode<T> left) {
        this.left = left;
    }
}
