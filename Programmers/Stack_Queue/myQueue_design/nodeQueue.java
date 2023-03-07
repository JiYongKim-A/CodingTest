import java.util.*;

class NodeQueue {
    Node front,rear;

    public NodeQueue() {
        front = rear = null;
    }

    public boolean queueIsEmpty() {
        if(front == null && rear == null){
            return true;
        }else{
            return false;
        }
    }

    public void add(int value) {
        Node node = new Node (value);
        if(queueIsEmpty()){
            front = rear = node;
        }else{
            rear.setNextNode(node);
            rear = node;
        }
    }

    public Integer pop() {
        if(queueIsEmpty()){
            return null;
        }else{
            Node popNode = this.front;
            front = front.getNextNode();
            return popNode.getValue();
        }
    }

    public Integer peek() {
        if(queueIsEmpty()){
            return null;
        }else{
            return front.getValue();
        }

    }

    public int size() {
        Node front = this.front;
        Node rear = this.rear;
        int count = 0;
        while(front!=null){
            count++;
            front = front.getNextNode();
        }
        return count;
    }

    public void print() {
        Node front = this.front;
        Node rear = this.rear;
        System.out.printf("queue = [ ");
        while(front!=null){
            System.out.printf(front.getValue()+" ");
            front = front.getNextNode();
        }
        System.out.printf("]");

    }

}

class Node{
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
