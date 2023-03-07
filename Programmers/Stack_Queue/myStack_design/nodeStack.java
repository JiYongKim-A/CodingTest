import java.util.*;

class Node {
    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

class NodeStack {
    Node top;

    public NodeStack() {
        this.top = null;
    }

    public boolean stackIsEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        if (stackIsEmpty()) {
            top = node;
        } else {
            node.setNextNode(top);
            top = node;
        }
    }

    public Integer pop() {
        if (stackIsEmpty()) {
            return null;
        } else {
            int value = top.getValue();
            top = top.nextNode;
            return value;
        }
    }

    public Integer peek() {
        if (stackIsEmpty()) {
            return null;
        } else {
            return top.getValue();
        }
    }

    public void print() {
        Node node = top;
        while (node != null) {
            System.out.printf("┃");
            System.out.printf(String.valueOf(node.getValue()));
            System.out.println("┃");
            node = node.nextNode;
        }
        System.out.println(" ▔ ");
    }
}