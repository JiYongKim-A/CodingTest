import java.util.*;
class Solution {
    // 시간복잡도 O(n)... n = word.length()
    public int solution(String word) {
       HashMap<String, Integer> alphabet = new HashMap<>();
        HashMap<Integer, Integer> index = new HashMap<>();
        alphabet.put("A", 0);
        alphabet.put("E", 1);
        alphabet.put("I", 2);
        alphabet.put("O", 3);
        alphabet.put("U", 4);
        index.put(0, 781);
        index.put(1, 156);
        index.put(2, 31);
        index.put(3, 6);
        index.put(4, 1);

        String[] split = word.split("");
        int result = 0;
        for (int i = 0; i < split.length; i++) {
             result+=alphabet.get(split[i]) * index.get(i) + 1;
        }
        return result;
    }
}