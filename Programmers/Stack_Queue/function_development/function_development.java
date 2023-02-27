import java.util.*;
class Solution {
    // 시간 복잡도 O(n)... n = progresses.length
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList();
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.offer((100 - progresses[i]) / speeds[i]);
            } else {
                queue.offer((100 - progresses[i]) / speeds[i] + 1);
            }
        }
        int past = -1;
        int count = 0;
        while (true) {
            Integer time = queue.poll();
            if (time == null) {
                result.add(count);
                break;
            }
            if (past == -1) {
                past = time;
                count++;
                continue;
            } else if (past >= time) {
                count++;
                continue;
            } else {
                result.add(count);
                past = time;
                count = 1;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}