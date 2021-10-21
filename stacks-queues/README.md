# Stack & Queues

**Stack**: A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.

Stacks follow these concepts:

- FILO(First In Last Out)
- LIFO(Last In First Out)

**Queue**  
Queues follow these concepts:

- FIFO(First In First Out)
- LILO(Last In Last Out)

## Challenge
<!-- Description of the challenge -->
write functions for the Stack class:  
- push
- pop
- peek
- isEmpty  

and function for the Queue class:  

- enqueue
- dequeue
- peek
- isEmpty

## Approach & Efficiency
Time complexity for all the functions is :**O(1)**  
Space complexity: **O(1)**
## API

- Push: add a node to the stack with a value passed to it in the begining of the stack
- pop: delete a node from the stack from the place it adds the nodes
- enqueue: add a node to the queue with a value passed to it in the end of the queue
- dequeue: delete a node from the begining of the queue 
- peek: return the value of the next node on the stack or queue
- isEmpty: check wheather the stack or queue is empty
