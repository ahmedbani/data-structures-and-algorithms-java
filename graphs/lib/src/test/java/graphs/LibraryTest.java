/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graphs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void graphArrayListTest() {
        Graph graph = new Graph();
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");

        assertEquals("[]", graph.graphList.toString());
        graph.addNode(n1);
        assertTrue(graph.graphList.contains(n1)); //check if the node is inside the list
        graph.addNode(n2);
        assertTrue(graph.graphList.contains(n2)); //checking the second one if it is inside the array as well
        graph.addNode(n3);
        graph.addNode(n4);

        assertEquals("[A, B, C, D]", graph.toString()); //this will check if the getNodes works correctly

        assertEquals(4, graph.size()); //this will check if the size method works correctly
    }

}
