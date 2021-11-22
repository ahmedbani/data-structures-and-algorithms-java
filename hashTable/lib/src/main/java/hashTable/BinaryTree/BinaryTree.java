package hashTable.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private BTnode<T> root;

    private List inOrder = new ArrayList();
    private List preOrder = new ArrayList();
    private List postOrder = new ArrayList();
    //maxVal
    private Integer maxVal;

    public BTnode<T> getRoot() {
        return root;
    }

    public void setRoot(BTnode<T> root) {
        this.root = root;
    }

    //InOrder travesal Function
    public List<T> inOrder(BTnode node) {
        if (node != null) {
            inOrder(node.getLeft());
            this.inOrder.add(node.getData());
            inOrder(node.getRight());
        }
        return this.inOrder;
    }

    //PreOrder Traversal Function
    public List<T> preOrder(BTnode node) {
        if (node != null) {
            this.preOrder.add(node.getData());
            if (node.getLeft() != null) {
                preOrder(node.getLeft());
            }
            if (node.getRight() != null) {
                preOrder(node.getRight());
            }
        }
        return this.preOrder;

    }

    //PostOrder Traversal Function
    public List<T> postOrder(BTnode noed) {
        if (noed != null) {
            if (noed.getLeft() != null) {
                postOrder(noed.getLeft());
            }
            if (noed.getRight() != null) {
                postOrder(noed.getRight());
            }
            this.postOrder.add(noed.getData());
        }
        System.out.println(this.postOrder);
        return this.postOrder;
    }
}

