/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graphs;

public class Library {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");

        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);
        graph.addNode(n4);

        System.out.println(graph.getNodes().toString());
        System.out.println(graph.size());
        graph.addEdge(n1,n2);
        graph.addEdge(n1,n3);
        graph.addEdge(n1,n4);
        System.out.println(graph.getNeighbors(n1));
        System.out.println(graph.getNeighbors(n2));

        System.out.println(graph.toString());
        System.out.println(graph.getNeighbors(n1));
    }
}
