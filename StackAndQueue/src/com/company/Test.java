package com.company;

public class Test {
    public static void main(String[] args) {
        testQueue();
        System.out.println("\n");
        testStack();
    }

    public static void testQueue(){
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            queue.add(i);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(queue.remove() + " ");
        }

    }

    public static void testStack(){
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            stack.push(i);
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}
