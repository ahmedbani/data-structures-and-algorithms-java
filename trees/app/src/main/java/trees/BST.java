package trees;

public class BST<T> extends BinaryTree{

    public void add(T value){
        Node node = new Node(value);
        if (root==null){
            root = node;
            return;
        }
        Node rootBefore = null;
        Node temp = root;
        while (temp!=null){
            if ((int)temp.getValue() < (int)value){
                rootBefore = temp;
                temp = temp.getRight();
            }
            else if((int)temp.getValue()>(int)value){
                rootBefore = temp;
                temp = temp.getLeft();
            }
        }
        if ((int)rootBefore.getValue() >(int)value){
            rootBefore.setLeft(node);
        }
        else if ((int)rootBefore.getValue() <= (int)value){
            rootBefore.setRight(node);
        }

    }

    public boolean contains(T value){
        if (root==null){
            return false;
        }
        Node rootBefore = null;
        Node temp = root;
        boolean result = false;
        while (temp!=null){
            if ((int)temp.getValue() < (int)value){
                rootBefore = temp;
                temp = temp.getRight();
            }
            else if((int)temp.getValue()>(int)value){
                rootBefore = temp;
                temp = temp.getLeft();
            }
            else {
                result = true;
                break;
            }
        }
        return result;
    }
}
