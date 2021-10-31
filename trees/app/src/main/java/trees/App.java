/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        BST bst = new BST();
        ArrayList arrayList = new ArrayList();

        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);


        System.out.println(bst.preOrder(bst.root,arrayList));
        arrayList.clear();
        System.out.println(bst.inOrder(bst.root,arrayList));
        arrayList.clear();
        System.out.println(bst.postOrder(bst.root,arrayList));
        System.out.println(bst.contains(80));

        System.out.println(bst.getMaxValue());
    }
}
