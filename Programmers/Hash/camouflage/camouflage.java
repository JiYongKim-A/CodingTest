import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
       HashMap<String, Integer> closet = new HashMap<>();
        int result = 1;
        for (int i = 0; i < clothes.length; i++) {
            if (closet.containsKey(clothes[i][1])) {
                closet.put(clothes[i][1], closet.get(clothes[i][1]) + 1);
            } else {
                closet.put(clothes[i][1], 1);
            }
        }


        for (String cloth : closet.keySet()) {
            result *= closet.get(cloth) + 1;
        }

        return result - 1;
    }
}