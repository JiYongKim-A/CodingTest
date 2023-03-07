import java.util.*;

class ArrayStack {
    int topIndex;
    int MAX = 3;
    int[] stack;

    public ArrayStack() {
        stack = new int[MAX];
        topIndex = -1;
    }

    public boolean stackIsFull() {
        if (topIndex == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean stackIsEmpty() {
        if (topIndex == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (stackIsFull()) {
            int[] temp = stack;
            MAX *= 2;
            stack = new int[MAX];
            stack = Arrays.copyOf(temp, MAX);
        }
        stack[++topIndex] = value;
    }

    public Integer pop() {
        if (stackIsEmpty()) {
            return null;
        } else {
            int popValue = stack[topIndex];
            stack[topIndex--] = 0;
            return popValue;
        }
    }

    public Integer peek() {
        if (stackIsEmpty()) {
            return null;
        } else {
            return stack[topIndex];
        }
    }

    public void print() {
        System.out.printf("queue = [ ");
        for (int i : stack) {
            System.out.printf(i + " ");
        }
        System.out.printf("]");
    }
}