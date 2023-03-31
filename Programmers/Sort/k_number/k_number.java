import java.util.*;
class Solution {
    // 시간복잡도 [최악 : O(n*m^2)],[평균 : O(n*mlogm)]... n = commands.length, m = arr.length
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        return answer;
    }
}