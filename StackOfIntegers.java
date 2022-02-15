package com.T4;

public class StackOfIntegers {

    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers( int capacity) {
        this.elements = new int[capacity];
        this.size = 0;

    }

    public boolean empty() {
        if (this.size == 0) {
            return true;
        }else {
            return false;
        }
    }


    public int peek() {
        if (this.size != 0){
            return this.elements[this.size];
        }else {
            // should throw exception
            return -9999999;
        }
    }

    public void push(int element) {
        // Test for capacity
        if (this.size < this.elements.length) {
            this.size++;
            this.elements[this.size] = element;
        }
    }

    public int pop() {
        if (this.size != 0) {
            int buf = this.elements[this.size];
            this.size--;
            return buf;
        }else {
            return -9999999;
        }
    }

    public int getSize() {
        return this.size;
    }


    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
