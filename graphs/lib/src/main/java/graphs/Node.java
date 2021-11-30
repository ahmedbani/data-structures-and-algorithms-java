package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T value;
    List<Edge> neighbors ;

    Node(T value){
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node n){
        Edge edge = new Edge(n);
        this.neighbors.add(edge);
    }
    public void addNeighbor(Node n, int weight){
        Edge edge = new Edge(n,weight);
        this.neighbors.add(edge);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
