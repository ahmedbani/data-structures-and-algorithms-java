package graphs;

public class Edge {
    int weight;
    Node dest;

    public Edge(Node dest) {
        this.dest = dest;
    }

    public Edge(Node dest,int weight) {
        this.weight = weight;
        this.dest = dest;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getDest() {
        return dest;
    }

    @Override
    public String toString() {
        return this.dest.toString();
    }
}
