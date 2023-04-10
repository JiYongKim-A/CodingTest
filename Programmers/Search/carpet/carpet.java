import java.util.*;
class Solution {
    // 시간복잡도 O(n) ... n = yellow
    public int[] solution(int brown, int yellow) { List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                list.add(i);
            }
        }
        int[] result = new int[2];
        for (int i : list) {
            int width = Math.max(i, yellow / i);
            int height = Math.min(i, yellow / i);
            if (width * 2 + height * 2 + 4 == brown) {
                result[0] = width + 2;
                result[1] = height + 2;
            }
            
        }
        
        return result;
    }
}