package org.example.ds;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());       //remove last added element - Three
        System.out.println(stack);

        System.out.println(stack.peek());       //remove last element - Two (after deleting Three)

        System.out.println(stack.poll());       //remove last added element - Two
        System.out.println(stack);

        stack.poll();
//        System.out.println(stack.pop());;
        System.out.println(stack.poll());
    }
}
/*
stack.pop()     => returns exception if stack is empty.
stack.poll()    => does not return exception if stack is empty. Instead, it returns null.
 */