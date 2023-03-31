import java.util.*;
class Solution {
    // 시간복잡도  [최악 : O(n^2)], [평균 : O(nlogn)]... n = citations.length
    public int solution(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            if (i+1 > arr[i]) {
                return i;
            }
        }
        return citations.length;
    
    }
}