import java.util.*;

class Solution {
    // 시간 복잡도 O(n*m)... n = bridge_length, m = truck_weights.length
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum_weight = 0;
        Integer last_truck = 0;

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        Queue<Integer> truck = new LinkedList<>();
        for (int i : truck_weights) {
            truck.add(i);
        }

        while (true) {
            Integer out_truck = bridge.poll();
            if (out_truck != null) {
                sum_weight -= out_truck;
            }
            if (truck.isEmpty()) {
                bridge.add(null);
            } else {
                if (sum_weight + truck.peek() > weight) {
                    bridge.add(0);
                } else {
                    int moving_truck = truck.poll();
                    bridge.add(moving_truck);
                    sum_weight += moving_truck;
                }
            }
            last_truck = out_truck;
            if (last_truck == null) {
                break;
            }
            time++;
        }
        return time;
    }
}