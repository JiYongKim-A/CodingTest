import java.util.*;

class Solution {
    // 시간복잡도 O(nlogn)... n = scoville.length
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(i);
        }

        int count = 0;
        while (queue.peek() < K) {
            if (queue.size() > 1) {
                count++;
                int a = queue.poll();
                int b = queue.poll();
                queue.add(a + b * 2);
            } else {
                return -1;
            }
        }
        return count;
    }
}