package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList preOrder(Node root,ArrayList preList){
        if(root != null){
            preList.add((T)root.getValue());
            preOrder(root.getLeft(),preList);
            preOrder(root.getRight(),preList);
        }
        return preList;
    }

    public ArrayList inOrder(Node root,ArrayList inList){
        if(root != null){
            inOrder(root.getLeft(),inList);
            inList.add(root.getValue());
            inOrder(root.getRight(),inList);
        }
        return inList;
    }

    public List<T> postOrder(Node root, ArrayList postList){
        if(root != null){
            postOrder(root.getLeft(),postList);
            postOrder(root.getRight(),postList);
            postList.add(root.getValue());
        }
        return postList;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
