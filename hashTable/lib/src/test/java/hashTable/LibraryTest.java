/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import hashTable.BinaryTree.BTnode;
import hashTable.BinaryTree.BinaryTree;
import hashTable.LeftJoin.LeftJoin;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    hashTable hashTable = new hashTable(50);
    @Test void add(){
        hashTable.add("10", 10);
        hashTable.add("20", 20);
        assertTrue( hashTable.contains("10"));
        assertFalse(hashTable.contains("5"));
        assertEquals(20,hashTable.get("20"));

    }
    @Test void colission(){
        hashTable.add("Cat", 123);
        hashTable.add("taC", 999);
        System.out.println(hashTable.get("Cat"));
        System.out.println(hashTable.contains("Cat"));
    }
    @Test void hashing(){
        assertEquals(0,hashTable.hash("Cat"));
    }
    @Test void nullKey(){
        assertEquals(null,hashTable.get("ahmed"));
    }
    @Test void repeatedWord(){
        String input1 = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, " +
                "it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all " +
                "going direct to Heaven, we were all going direct the other way – in short, " +
                "the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String input4 = " it was an amazing trip today";
        assertEquals("a",hashTable.repeatedWord(input1));
        assertEquals("it",hashTable.repeatedWord(input2));
        assertEquals("summer",hashTable.repeatedWord(input3));
        assertEquals(null,hashTable.repeatedWord(input4));
    }
    @Test void treeIntersection(){
        BinaryTree bt1 = new BinaryTree();
        bt1.setRoot(new BTnode(150));
        bt1.getRoot().setLeft(new BTnode(100));
        bt1.getRoot().getLeft().setLeft(new BTnode(75));
        bt1.getRoot().getLeft().setRight(new BTnode(160));
        bt1.getRoot().getLeft().getRight().setLeft(new BTnode(125));
        bt1.getRoot().getLeft().getRight().setRight(new BTnode(175));
        bt1.getRoot().setRight(new BTnode(250));
        bt1.getRoot().getRight().setLeft(new BTnode(200));
        bt1.getRoot().getRight().setRight(new BTnode(350));
        bt1.getRoot().getRight().getRight().setLeft(new BTnode(300));
        bt1.getRoot().getRight().getRight().setRight(new BTnode(500));

        BinaryTree bt2 = new BinaryTree();
        bt2.setRoot(new BTnode(42));
        bt2.getRoot().setLeft(new BTnode(100));
        bt2.getRoot().getLeft().setLeft(new BTnode(15));
        bt2.getRoot().getLeft().setRight(new BTnode(160));
        bt2.getRoot().getLeft().getRight().setLeft(new BTnode(125));
        bt2.getRoot().getLeft().getRight().setRight(new BTnode(175));
        bt2.getRoot().setRight(new BTnode(600));
        bt2.getRoot().getRight().setLeft(new BTnode(200));
        bt2.getRoot().getRight().setRight(new BTnode(350));
        bt2.getRoot().getRight().getRight().setLeft(new BTnode(4)) ;
        bt2.getRoot().getRight().getRight().setRight(new BTnode(500));

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(160);
        list.add(125);
        list.add(175);
        list.add(200);
        list.add(350);
        list.add(500);
        assertEquals(list,hashTable.treeIntersection(bt1,bt2));
    }
    @Test
    public void testLeftJoin(){
        LeftJoin LL = new LeftJoin();
        HashMap<Object, String> firstTable  = new HashMap<Object, String>();
        firstTable.put("fond", "enamored");
        firstTable.put("wrath", "anger");
        firstTable.put("diligent", "employed");
        firstTable.put("outift", "garb");
        HashMap<Object, String> secondTable = new HashMap<Object, String>();
        secondTable.put("fond", "averse");
        secondTable.put("wrath", "delight");
        secondTable.put("diligent", "idle");
        secondTable.put("outift", "follow");

        assertEquals("[diligent: employed& idle, wrath: anger& delight, outift: garb& follow, fond: enamored& averse]" , LL.leftJoin(firstTable,secondTable).toString());
    }
}
