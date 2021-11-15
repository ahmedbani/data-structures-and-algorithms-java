# Challenge26: Insertion Sort

Write a method that takes in an array of integers and sorts them in an ascending order using insertion sort algorithm.

### Approach & Efficiency

**First loop:** begins with the second element of the array checking the elements behind it every iteration until the end of the array.

**Second loop:** to shift every element that is bigger than the reached element one position until reaching the right position, we add the reached element inside to have the ordered array.

### Whiteboard Process

![Code Challenge 26](whiteBoards/CC26.PNG)

### Blog for challenge 27:
[Blog26](Blogs/blog26.md)

# Challenge26: Merge Sort

Write a method that takes in an array of integers and sorts them in an ascending order using merge sort algorithm.

### Approach & Efficiency

**Recursion:** splits the array into 2 seperated arrays, left, and right, and then makes a recursive call on the left, then on the right, then calls another method to order the returned array.

**Inner loop:** It is responsible for the ordering of the sub arrays, when there are no left or right left to call the recursive function.


### Whiteboard Process

![Code Challenge 27](whiteBoards/CC27.PNG)

### Blog for challenge 26:
[Blog27](Blogs/blog27.md)
