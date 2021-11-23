# Hashtables

A data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.

## Challenge

Implement a Hashtable Class with the following methods:

- add
  - Arguments: key, value
  - Returns: nothing
  - This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
- get
  - Arguments: key
  - Returns: Value associated with that key in the table
- contains
  - Arguments: key
  - Returns: Boolean, indicating if the key exists in the table already.
- hash
  - Arguments: key
  - Returns: Index in the collection for that key


## Approach & Efficiency

Big O space/time: O(1)

## API

have an add function to added the value in the array

have a contain to check if the key is available or not

have a get function to get the value of index

have a hash function to return the place of key for index size

# Challenge 31: Repeated Words

<!-- Description of the challenge -->
Write a function called repeated word that finds the first word to occur more than once in a string


## Whiteboard Process
<!-- Embedded whiteboard image -->
![repeatedWords](whiteBoards/cc31.png)

## Approach & Efficiency

Time & Space Complexity: O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->
- create a method that takes a string as an argument
- create an array that contains the input split into words in the array
- create a hash table
- loop through the array of words and check if the index is empty add it to the hash table the key and value are the same word
- else return the word in that index

# Challenge 32: Tree Intersection

Write a function called tree_intersection that takes two binary trees as parameters, Using your Hashmap implementation , return a set of values found in both trees.

## Whiteboard Process

![cc32](whiteBoards/cc32.png)

## Approach & Efficiency

Time & Space Complexity: O(n)

## Solution

- create a function that takes two binary trees and returns a list
- create a hash table and a list for the duplicates
- add the first tree to the hash table using recursion for the left and right children
- then get the duplicates by using the second tree if its already in the hash table add it to the list else add it to the table using recursion for left and right
- when it ends return the list that contains the duplicates

# Hashmap LEFT JOIN
<!-- Short summary or background information -->
LEFT JOIN , returns all records from the left (first) table and the matched records from the right (second) table. If there is no match for a specific record, you'll get NULLs in the corresponding columns of the right table.

## Challenge
<!-- Description of the challenge -->
Write a function that LEFT JOINs two hashmaps into a single data structure.

## Approach & Efficiency

Time & Space Complexity: O(n)

## Solution
<!-- Embedded whiteboard image -->
![cc33](whiteBoards/cc33.png)
