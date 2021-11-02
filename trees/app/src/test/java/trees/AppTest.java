/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    BST bst = new BST();
    App app = new App();
    @Test void testTree() {

        assertEquals("BinaryTree{root=null}", bst.toString());
        bst.add(80);
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        list1.add(80);
        assertEquals(list1, bst.inOrder(bst.root,list));
    }
    @Test void testAddingNodes(){
        bst.add(10);
        bst.add(5);
        bst.add(21);
        assertTrue((int)bst.root.getLeft().getValue()==5);
        assertTrue((int)bst.root.getRight().getValue()==21);
    }
    @Test void testTraversing(){
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);
        ArrayList list = new ArrayList();
        ArrayList actualResult = new ArrayList();
        actualResult.add(20);
        actualResult.add(30);
        actualResult.add(40);
        actualResult.add(50);
        actualResult.add(60);
        actualResult.add(70);
        actualResult.add(80);
        assertEquals(actualResult, bst.inOrder(bst.root, list));
        list.clear();
        actualResult.clear();
        actualResult.add(50);
        actualResult.add(30);
        actualResult.add(20);
        actualResult.add(40);
        actualResult.add(70);
        actualResult.add(60);
        actualResult.add(80);
        assertEquals(actualResult, bst.preOrder(bst.root, list));
        list.clear();
        actualResult.clear();
        actualResult.add(20);
        actualResult.add(40);
        actualResult.add(30);
        actualResult.add(60);
        actualResult.add(80);
        actualResult.add(70);
        actualResult.add(50);
        assertEquals(actualResult, bst.postOrder(bst.root, list));
    }

    @Test void testMaxValue(){
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);
        assertEquals(80,bst.getMaxValue());
    }

    @Test void breadthFirst(){
        ArrayList actualResult = new ArrayList();
        assertEquals(actualResult,app.breadthFirst(bst));
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);

        actualResult.add(50);
        actualResult.add(30);
        actualResult.add(70);
        actualResult.add(20);
        actualResult.add(40);
        actualResult.add(60);
        actualResult.add(80);
        assertEquals(actualResult,app.breadthFirst(bst));
    }
    @Test
    public void fizzbuzzTest(){
        KaryTree karyTree = new KaryTree(3);
        Knode root = new Knode(10);
        Knode node1 = new Knode(7);
        Knode node2 = new Knode(15);
        Knode node3 = new Knode(3);
        Knode node4 = new Knode(8);
        Knode node5 = new Knode(13);
        Knode node6 = new Knode(20);

        karyTree.setRoot(root);

        root.getChildren().add(node1);
        root.getChildren().add(node2);

        node1.getChildren().add(node3);

        node2.getChildren().add(node4);
        node2.getChildren().add(node5);
        node2.getChildren().add(node6);

        app.fizzBuzz(karyTree);

        assertEquals("Buzz", root.getValue());
        assertEquals("7", node1.getValue());
        assertEquals("FizzBuzz", node2.getValue());
        assertEquals("Fizz", node3.getValue());
        assertEquals("8", node4.getValue());
        assertEquals("13", node5.getValue());
        assertEquals("Buzz", node6.getValue());
    }
}
