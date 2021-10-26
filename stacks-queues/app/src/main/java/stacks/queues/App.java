/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stacks.queues;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        Stack newStack = new Stack();
        System.out.println(newStack.pop());
        newStack.push(1);
        System.out.println(newStack.toString());
        newStack.push(1);
        newStack.push(3);
        System.out.println(newStack);
        System.out.println(newStack.pop());
        System.out.println(newStack);
        newStack.push(6);
        System.out.println(newStack.peek());
        System.out.println(newStack.isEmpty());

        Queue newQueue = new Queue();
        System.out.println(newQueue.isEmpty());
        newQueue.enqueue(10);
        newQueue.enqueue(5);
        newQueue.enqueue(30);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.back.getValue());
        System.out.println(newQueue.front.getValue());
        System.out.println(newQueue);
        System.out.println(newQueue.peek());
        System.out.println(newQueue.isEmpty());

        Stack f = new Stack();
        PseudoQueue pseudoQueue = new PseudoQueue(newStack,f);

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue.toString());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.toString());

        Cats cat = new Cats(4,"fluffy");
        Dogs dog = new Dogs(3,"floki");
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(cat);
        System.out.println(animalShelter.toString());
        System.out.println(animalShelter.dequeue("dog"));
        animalShelter.enqueue(dog);
        System.out.println(animalShelter.toString());
        System.out.println(animalShelter.dequeue("cat"));
        System.out.println(animalShelter.toString());
        System.out.println("CC13");
        System.out.println(bracketValidation("{}"));
        System.out.println(bracketValidation("{}(){}"));
        System.out.println(bracketValidation("()[[Extra Characters]]"));
        System.out.println(bracketValidation("{}{Code}[Fellows](())"));
        System.out.println(bracketValidation("{(})"));
        System.out.println(bracketValidation("[({}]"));
        System.out.println(bracketValidation(""));

    }

    // made the return type object cause if string passed is empty it will tell the user that there is nothing to check
    public static Object bracketValidation(String str){
        Stack stack = new Stack();
        char check;
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                check = str.charAt(i);
                if (check == '{' || check == '[' || check == '(')
                    stack.push(check);
                else if (check == '}' || check == ']' || check == ')') {
                    if (check == '}')
                        if (stack.peek() == (Character) '{') {
                            stack.pop();
                            continue;
                        }
                    if (check == ']')
                        if (stack.peek() == (Character) '[') {
                            stack.pop();
                            continue;
                        }
                    if (stack.peek() == (Character) '(') {
                        stack.pop();
                        continue;
                    }
                } else continue;
            }
            return stack.isEmpty();
        }
        else return "there is nothing to check";
    }
}
