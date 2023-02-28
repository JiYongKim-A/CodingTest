import java.util.*;
class Solution {
    // 시간 복잡도 O(n).... n = arr.length
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int past = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == past) {
                continue;
            } else {
                list.add(arr[i]);
                past = arr[i];
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}