/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {

    public static void main(String[] args) {
        LinkedList ahmedsLinkedList = new LinkedList<Integer>();
        ahmedsLinkedList.insert(10);
        ahmedsLinkedList.insert(5);
        ahmedsLinkedList.insert(6);
        ahmedsLinkedList.insert(10);
        ahmedsLinkedList.append(20);
        ahmedsLinkedList.insertBefore(5,34);
        ahmedsLinkedList.insertAfter(6,22);

        System.out.println(ahmedsLinkedList.toString());
//        ahmedsLinkedList.deleteAndInsert(34,13);
//        System.out.println(ahmedsLinkedList.toString());
//        System.out.println(ahmedsLinkedList.includes(3));
        System.out.println(ahmedsLinkedList.getFromEnd(3));

//        System.out.println(ahmedsLinkedList.kthFromEnd(3));

        LinkedList newLinkedList = new LinkedList<Integer>();

        newLinkedList.insert(12);
        newLinkedList.insert(12);
        newLinkedList.insert(12);
        newLinkedList.insert(12);
        newLinkedList.insert(12);
        newLinkedList.insert(12);

//        System.out.println(newLinkedList.toString());
//        newLinkedList.deleteAndInsert(12,5);
//        System.out.println(newLinkedList.toString());

        LinkedList zip = new LinkedList<Integer>();


//        System.out.println(zip);


//        System.out.println(zip.zipLists(ahmedsLinkedList,newLinkedList));

    }
}
