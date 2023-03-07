import java.util.*;
class ArrayQueue {
    int MAX = 100;
    int front;
    int rear;
    int[] queue;

    public ArrayQueue() {
        front = rear = 0;
        queue = new int[MAX];
    }

    public boolean queueIsEmpty() {
        return front == rear;
    }

    public boolean queueIsFull() {
        if (rear == MAX - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return front - rear;
    }

    public void add(int value) {
        if (queueIsFull()) {
            int[] temp = queue;
            MAX *= 2;
            queue = new int[MAX];
            queue = Arrays.copyOf(temp, MAX);
        }
        queue[rear++] = value;
    }

    public Integer pop() {
        if (queueIsEmpty()) {
            return null;
        }
        return queue[front++];
    }

    public Integer peek() {
        if (queueIsEmpty()) {
            return null;
        }
        return queue[front];
    }

    public void print() {
        System.out.printf("queue = [ ");
        for (int i : queue) {
            System.out.printf(i + " ");
        }
        System.out.printf("]");
    }

}
