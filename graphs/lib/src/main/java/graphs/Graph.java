package graphs;

import java.util.*;

public class Graph<T> {
    List<Node<T>> graphList;

    Graph() {
        graphList = new ArrayList<>();
    }

    public void addNode(Node<T> node) {
//        Node<T> newNode = new Node<T>(value);
        graphList.add(node);
    }

    public void addEdge(Node n1, Node n2) {
        if (graphList.contains(n1) && graphList.contains(n2)) {
            n1.addNeighbor(n2);
            n2.addNeighbor(n1);
        } else
            System.out.println("One or more of the values are not valid...");
    }

    public void addEdge(Node n1, Node n2, int weight) {
        if (graphList.contains(n1) && graphList.contains(n2)) {
            n1.addNeighbor(n2, weight);
            n2.addNeighbor(n1, weight);
        } else
            System.out.println("One or more of the values are not valid...");
    }

    public List<Node<T>> getNodes() {
        return graphList;
    }

    public List<Node<T>> getNeighbors(Node n) {
        return n.neighbors;
    }

    public int size() {
        return graphList.size();
    }

    public Node getNode(T value) {

        Node arr[] = new Node[graphList.size()];
        int j = 0;
        for (Node node : graphList) {
            arr[j] = node;
            j++;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].value == value) {
                return arr[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < graphList.size() - 1; i++) {
            result += graphList.get(i).value + ", ";
        }
        result += graphList.get(graphList.size() - 1).value + "]";
        return result;
    }

    public List<T> breadthFirst(Node node) {
        List<T> nodesList = new ArrayList<>();
        Queue breadth = new LinkedList<>();
        Set visited = new HashSet();

        breadth.add(node);
        visited.add(node);

        while (!breadth.isEmpty()) {
            Node<T> front = (Node<T>) breadth.poll();
            nodesList.add(front.value);

            for (Node<T> child : getNeighbors(node)) {
                if (!visited.contains(child)) {
                    visited.add(child);
                    breadth.add(child);
                }
            }
        }
        return nodesList;
    }

    public List<Node> depthFirst(Node node) {

        if (node == null)
            return null;
        List<Node> visited = new ArrayList();
        visited = DFS(node,visited);
        return visited;
    }
    public List<Node> DFS(Node node , List visited){
        visited.add(node);
        List<Edge> neighbors = node.neighbors;
        for (Edge edge: neighbors) {
            if(!visited.contains(edge.dest))
                DFS(edge.dest,visited);
        }
        return visited;
    }
}

