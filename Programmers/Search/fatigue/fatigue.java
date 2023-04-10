import java.util.*;
class Solution {
    // 시간 복잡도 O(n!*n^2).... n = dungeons.length
    public int solution(int k, int[][] dungeons) {
        if(dungeons.length == 0){
            return 0;
        }
        Dungeon[] dungeon = new Dungeon[dungeons.length];
        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k) {
                dungeon[i] = new Dungeon(dungeons[i][0], dungeons[i][1]);
            }
        }

        String[] arr = new String[dungeon.length];
        for(int i = 0; i<arr.length; i++){
            arr[i] = String.valueOf(i);
        }

        Set<String> set = new HashSet<>(getPermutation(arr));
        int result = 0;

        for(String s : set){
            String[] split = s.split("");
            int count = 0;
            int fatigue = k;
            for(int i =0; i<split.length;i++){
                if(dungeon[Integer.valueOf(split[i])].minimal_fatigue>fatigue){
                    break;
                }else{
                    fatigue-=dungeon[Integer.valueOf(split[i])].reduced_fatigue;
                }
                count++;
            }
            if(count>result){
                result = count;
            }
        }

        return result;
    }
    
    public List<String> getPermutation(String[] numbers) {
        List<String> list = new ArrayList<>();
        permutation("", numbers, list);
        Collections.sort(list);
        return list;
    }

    private void permutation(String prefix, String[] numbers, List<String> list) {
        int n = numbers.length;
        if (n == 0) {
            list.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + numbers[i], removeElement(numbers, i), list);
                if (!prefix.equals("")) list.add(prefix);
            }
        }
    }
    private String[] removeElement(String[] arr, int index) {
        int n = arr.length;
        String[] newArray = new String[n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i != index) {
                newArray[k++] = arr[i];
            }
        }
        return newArray;
    }
}

class Dungeon{
    public int minimal_fatigue;
    public int reduced_fatigue;

    Dungeon(int minimal_fatigue, int reduced_fatigue) {
        this.minimal_fatigue = minimal_fatigue;
        this.reduced_fatigue = reduced_fatigue;
    }

}