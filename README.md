Assignment 2
The assignment includes the implementation of several data structures such as MyArrayList, MyLinkedList, MyQueue, MyStack, MyMinHeap, and MyList interface.

1. MyArrayList
MyArrayList is a custom implementation of a dynamic array. It stores elements in a resizable array, allowing for random access to elements by index. The array is automatically resized when it reaches its capacity.

Implements the MyList interface. 
Supports adding, removing, and retrieving elements by index. 
Allows resizing of the internal array as needed.

2. MyLinkedList is a custom implementation of a doubly linked list, where each node contains a reference to both the next and previous node. 

Implements the MyList interface.
Provides fast insertions and deletions at the beginning and end.

3. MyQueue
MyQueue is a custom implementation of a queue, which follows the FIFO (First-In, First-Out) principle. It allows elements to be added to the back of the queue and removed from the front.

Implements a queue using a linked list.
Provides methods to enqueue (add) and dequeue (remove) elements.

4. MyStack
MyStack is a custom implementation of a stack, following the LIFO (Last-In, First-Out) principle. It allows elements to be pushed onto the stack and popped from the top.

Implements a stack using a linked list.
Provides methods to push (add) and pop (remove) elements.

5. MyMinHeap
MyMinHeap is a custom implementation of a min-heap, a complete binary tree where the value of each parent node is less than or equal to the values of its children.

MyList Interface
The MyList interface defines a common set of methods that all list-like data structures should implement.
