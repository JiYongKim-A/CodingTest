import java.util.LinkedList;

public class MyHashMap {
    LinkedList<Node>[] bucket;
    int size;

    // Node 정의
     public class Node{
         String key;
         String value;
         Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // 생성자 size 설정
    MyHashMap(int size) {
        this.size = size;
        this.bucket = new LinkedList[size];
    }

    int getHashCode(String key) {
        return key.hashCode();
    }

    int getIndex(int hashCode) {
        return hashCode % size;
    }

    Node findByKey(LinkedList<Node> bucket, String key){
        if(bucket == null) return null;
        for(Node node : bucket){
            if(node.key.equals(key)){
                return node;
            }
        }
        return null;
    }

    void put(String key, String value){
        int index = getIndex(getHashCode(key));
        LinkedList<Node> nodes = bucket[index];
        if (nodes == null) {
            nodes = new LinkedList<>();
            bucket[index] = nodes;
        }
        Node findNode = findByKey(nodes, key);
        if(findNode == null){
            nodes.addLast(new Node(key,value));
        }else{
           findNode.value=value;
        }
    }
    
    String get(String key){
        int index = getIndex(getHashCode(key));
        LinkedList<Node> nodes = bucket[index];
        Node findNode = findByKey(nodes, key);
        if (findNode == null) {
            return null;
        }else{
            return findNode.value;
        }
    }

    void remove(String key){
        int index = getIndex(getHashCode(key));
        LinkedList<Node> nodes = bucket[index];
        Node findNode = findByKey(nodes, key);
        if (findNode != null){
            nodes.remove(findNode);
        }
    }
    
}


