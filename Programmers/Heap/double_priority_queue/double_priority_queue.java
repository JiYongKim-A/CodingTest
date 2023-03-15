import java.util.*;
class Solution {
    // 시간복잡도 O(n^2)... n = operations.length
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (String s : operations) {
            String[] split = s.split(" ");
            Integer num = Integer.valueOf(split[1]);
            if (split[0].equals("I")) {
                maxQueue.add(num);
                minQueue.add(num);
            } else {
                if (!maxQueue.isEmpty()) {
                    if (num == 1) {// 최댓값 삭제
                        minQueue.remove(maxQueue.poll());
                    } else {
                        maxQueue.remove(minQueue.poll());
                    }
                }
            }
        }
        if (maxQueue.isEmpty()) {
            int[] answer = {0, 0};
            return answer;
        } else {
            int[] answer = {maxQueue.poll(), minQueue.poll()};
            return answer;
        }
    }
}