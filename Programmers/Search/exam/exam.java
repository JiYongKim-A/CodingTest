import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] arr = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                arr[0] += 1;
            }
            if (answers[i] == second[i % second.length]) {
                arr[1] += 1;
            }
            if (answers[i] == third[i % third.length]) {
                arr[2] += 1;
            }
        }
        int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
        for (int i = 0; i < 3; i++) {
            if (max == arr[i]) {
                list.add(i + 1);
            }
        }


        return list.stream().mapToInt(i->i).toArray();
    }
}