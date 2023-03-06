import java.util.*;
class Solution {
    // 시간 복잡도 O(n)... n = priorites.length
    public int solution(int[] priorities, int location) {
        Deque<docs> deque = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        int printingCount = 0;
        for (int i : priorities) {
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        Queue<Integer> queue = new LinkedList<>(list);

        for (int i = 0; i < priorities.length; i++) {
            deque.addLast(new docs(priorities[i], i));
        }
        while (!queue.isEmpty()) {
            if (deque.peek().priority != queue.peek()) {
                deque.addLast(deque.pop());
            } else {
                queue.poll();
                docs docs = deque.pop();
                printingCount++;
                if (docs.index == location) {
                    return printingCount;
                }
            }
        }
        return 0;
    }
}

class docs {
    int priority;
    int index;

    public docs(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}