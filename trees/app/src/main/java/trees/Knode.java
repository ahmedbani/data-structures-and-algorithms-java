package trees;

import java.util.ArrayList;
import java.util.List;

public class Knode<T> {
    private T value;
    private ArrayList<Knode> children;


    public Knode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Knode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Knode> children) {
        this.children = children;
    }

}
