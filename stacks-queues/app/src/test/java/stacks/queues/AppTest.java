/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacks.queues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app = new App();
    Stack newStack = new Stack();
    Queue newQueue = new Queue();
    @Test void testPushStack(){
        newStack.push(10);
        assertFalse(newStack.isEmpty());
        newStack.push(5);
        newStack.push(30);
        assertEquals(30,newStack.top.getValue());
        assertEquals("{ 30 } -> { 5 } -> { 10 } -> NULL",newStack.toString());
    }
    @Test void popStack(){
        newStack.push(10);
        newStack.push(20);
        newStack.push(19);
        newStack.pop();
        assertEquals("{ 20 } -> { 10 } -> NULL",newStack.toString());
        newStack.pop();
        newStack.pop();
        assertEquals("the stack is empty",newStack.pop());
    }
    @Test void peek(){
        newStack.push(30);
        newStack.push(15);
        assertEquals(15,newStack.peek());
    }
    @Test void instantiation(){
        Stack instanceStack = new Stack();
        assertTrue(instanceStack.isEmpty());
        assertEquals("the stack is empty",instanceStack.peek());
        assertEquals("the stack is empty",instanceStack.pop());
    }
    @Test void enqueue(){
        assertTrue(newQueue.isEmpty());
        newQueue.enqueue('a');
        assertFalse(newQueue.isEmpty());
        newQueue.enqueue(20);
        newQueue.enqueue(9);
        assertEquals("{ a } -> { 20 } -> { 9 } -> NULL",newQueue.toString());

    }
    @Test void dequeue(){
        newQueue.enqueue('a');
        newQueue.enqueue('b');
        newQueue.enqueue('c');
        assertEquals('a',newQueue.dequeue());
        assertEquals('b',newQueue.peek());
        newQueue.dequeue();
        newQueue.dequeue();
        assertEquals("the queue is empty",newQueue.dequeue());
    }
    @Test void emptyQueue(){
        Queue emptyQueue= new Queue();
        assertTrue(emptyQueue.isEmpty());
        assertEquals("the queue is empty",newQueue.dequeue());
        assertEquals("the queue is empty",newQueue.peek());
    }
    @Test void testPseudoQueue(){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        PseudoQueue pseudoQueue = new PseudoQueue(stack1,stack2);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(20);
        assertEquals("pseudoQueue{{ 15 } -> { 4 } -> { 20 } -> NULL}",pseudoQueue.toString());
        pseudoQueue.dequeue();
        assertEquals("pseudoQueue{{ 4 } -> { 20 } -> NULL}",pseudoQueue.toString());
        assertEquals(4,pseudoQueue.dequeue());
        pseudoQueue.dequeue();
        assertEquals("the queue is empty",pseudoQueue.dequeue());
    }
    @Test void testAnimalShelter(){
        Cats cat = new Cats(4,"fluffy");
        Dogs dog = new Dogs(3,"floki");
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(cat);
        assertFalse(animalShelter.cats.isEmpty());
        assertEquals("dogs=NULL, cats={ age=4, name='fluffy } -> NULL",animalShelter.toString());
        assertEquals("there is no dogs",animalShelter.dequeue("dog"));
        animalShelter.enqueue(dog);
        assertEquals("dogs={ age=3, name='floki } -> NULL, cats={ age=4, name='fluffy } -> NULL",animalShelter.toString());
        animalShelter.dequeue("cat");
        assertTrue(animalShelter.cats.isEmpty());
    }
    @Test void testBracketValidation(){
        assertTrue((Boolean) app.bracketValidation("{}(){}"));
        assertTrue((Boolean) app.bracketValidation("{}{Code}[Fellows](())"));
        assertFalse((Boolean) app.bracketValidation("{(})"));
        assertEquals("there is nothing to check",app.bracketValidation(""));
    }
}
