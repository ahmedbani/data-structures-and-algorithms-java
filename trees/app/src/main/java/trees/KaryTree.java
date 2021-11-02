package trees;

public class KaryTree {
    private Knode root;
    private int k; // max num of nodes

    public KaryTree(int k) {
        this.k = k;
    }

    public Knode getRoot() {
        return root;
    }

    public void setRoot(Knode root) {
        this.root = root;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

}
