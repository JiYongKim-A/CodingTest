import java.util.*;
class Solution {
    // 시간 복잡도 O(n)... n = prices.length
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        int p1 = 0;
        int p2 = p1 + 1;
        int distance = 0;
        while (true) {
            if (p1 == prices.length - 1) {
                result[p1] = 0;
                break;
            }
            if (p2 < prices.length) {
                if (prices[p1] <= prices[p2]) {
                    distance++;
                    p2++;
                } else {
                    result[p1] = distance + 1;
                    p1++;
                    p2 = p1 + 1;
                    distance = 0;
                }
            } else {
                result[p1] = distance;
                p1++;
                p2 = p1 + 1;
                distance = 0;
            }
        }
        return result;
    }
}