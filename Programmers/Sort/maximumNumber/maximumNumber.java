import java.util.*;
class Solution {
    // 시간복잡도 [최악 : O(n^2)],[평균 : O(nlogn)]... n = numbers.length
    public String solution(int[] numbers) {
       String[] arr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String answer = "";
       
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        if (arr[0].equals("0"))
            return "0";

        for(String s: arr)
            answer += s;

        return answer;
    }
}