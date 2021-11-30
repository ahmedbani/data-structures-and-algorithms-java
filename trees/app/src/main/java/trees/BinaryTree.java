package trees;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public Integer getMaxValue(){
        Integer maxVal = 0;
        ArrayList<Integer> list = new ArrayList();
        if (getRoot() != null){
            List<Integer> newarr = (List<Integer>) postOrder(this.getRoot(),list);
            for (Integer i : newarr){
                if (maxVal < (Integer) i){
                    maxVal = (Integer) i;
                }
            }
        }
        return maxVal;
    }

    public List<Integer> breadthFirst(BinaryTree<Integer> tree){
        List<Integer> result = new ArrayList<Integer>();
        LinkedList<Node> queue = new LinkedList<>();
        if (tree.getRoot() != null){
            queue.add(tree.getRoot());
            while(!queue.isEmpty()){
                Node node = queue.remove();
                result.add((Integer) node.getValue());
                if(node.getLeft() != null){
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null){
                    queue.add(node.getRight());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
