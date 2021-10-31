# Trees

trees consist of:  
- Node - A Tree node is a component which may contain it’s own values, and references to other nodes
- Root - The root is the node at the beginning of the tree
- K - A number that specifies the maximum number of children any node may have in a k-ary tree. In a binary tree, k = 2.
- Left - A reference to one child node, in a binary tree
- Right - A reference to the other child node, in a binary tree
- Edge - The edge in a tree is the link between a parent and child node
- Leaf - A leaf is a node that does not have any children
- Height - The height of a tree is the number of edges from the root to the furthest leaf


## Challenge

create a binary tree class , a Node class , and a BST that extends the binary tree class that has 2 methods :  
1. add
2. contains

## Approach & Efficiency

**Complexity:**  
Time & Space complexity: O(n)

## API

- add method: takes a value as an argument, the value will be checked if its bigger than the root it will be stored in the right sub tree of the root and if it was less than the root it will be stored in left.  
- contains method: takes a value as an argument and it will check whether this value is in the tree or not and return a boolean

# Challenge Summary

create a function that returns the maximum value in the tree  
input: Tree  
output: Integer  

## Whiteboard Process

![whiteboard](whiteboards/treeMax.png)

## Approach & Efficiency

complexity:  
time complexity: O(n)  
space complexity: O(1)  

## Solution

verification:  

```java
BST bst = new BST();  

bst.add(50);  
bst.add(30);  
bst.add(20);  
bst.add(40);  
bst.add(70);  
bst.add(60);  
bst.add(80);  

bst.getMaxValue(); // input  
// output: 80
```
