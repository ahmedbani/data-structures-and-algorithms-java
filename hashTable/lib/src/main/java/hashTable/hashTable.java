package hashTable;

import hashTable.BinaryTree.BTnode;
import hashTable.BinaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hashTable<T> {
    private long size;
    Node[] hashArray;


    public hashTable(int size) {
        this.size = size;
        hashArray = new Node[size];
    }

    public long hash(String key) {
        long count = 0;
        for (int i = 0; i < key.length(); i++) {
            count += (long)key.charAt(i);
        }
        count = (count * 599) % this.size;
        return count;
    }

    public void add(String key ,T value) {
        Node newNode = new Node(key, value);
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            hashArray[(int) hashedKey] = newNode;
        }else{
            newNode.next = hashArray[(int) hashedKey];
            hashArray[(int) hashedKey] = newNode;
        }
    }

    public T get(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return null;
        }else{
            Node counter;
            counter = hashArray[(int)hashedKey];
            while(counter != null)
                if(counter.getKey().equals(key)){
                    return (T)counter.getValue();
                }else{
                    counter = counter.next;
                }
        }
        return null;
    }

    public boolean contains(String key){
        long hashedKey = hash(key);
        if(hashArray[(int) hashedKey] == null){
            return false;
        }else{
            Node counter;
            counter = hashArray[(int) hashedKey];
            while(counter != null)
                if(counter.getKey().equals(key))
                    return true;
                else{
                    counter = counter.next;
                }
        }
        return false;
    }
    public static String repeatedWord(String input){
        String[] splitString = input.toLowerCase().split("[, ?.@]+", -1);
        hashTable stringHashTable = new hashTable(50);
        for(int i = 0 ; i < splitString.length ; i++){
            if(stringHashTable.get(splitString[i]) != null){
                return splitString[i];
            }
            stringHashTable.add(splitString[i], splitString[i]);
        }
        System.out.println(Arrays.toString(splitString));
        return null;
    }
    public List<Integer> treeIntersection(BinaryTree firstTree, BinaryTree secondTree){
        hashTable newHashTable = new hashTable(50);
        List<Integer> duplicateList = new ArrayList<>();
        addTreeToHash(firstTree.getRoot(), newHashTable);
        getDuplicates(secondTree.getRoot(), duplicateList, newHashTable);
        return duplicateList;
    }

    public void addTreeToHash(BTnode<T> visitedNode, hashTable newHashTable){
        newHashTable.add(visitedNode.getData().toString(), visitedNode.getData());
        if(visitedNode.getLeft() != null){
            addTreeToHash(visitedNode.getLeft(), newHashTable);
        }
        if(visitedNode.getRight() != null){
            addTreeToHash(visitedNode.getRight(), newHashTable);
        }
    }

    public void getDuplicates(BTnode<T> visitedNode, List<Integer> duplicateList, hashTable newHashTable){
        if(newHashTable.contains(visitedNode.getData().toString())){
            duplicateList.add((int)visitedNode.getData());
        }else{
            newHashTable.add(visitedNode.getData().toString(), visitedNode.getData());
        }

        if(visitedNode.getLeft() != null){
            getDuplicates(visitedNode.getLeft(), duplicateList, newHashTable);
        }
        if(visitedNode.getRight() != null){
            getDuplicates(visitedNode.getRight(), duplicateList, newHashTable);
        }
    }
}
