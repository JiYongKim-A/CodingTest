import java.util.*;
class Solution {
    // 시간 복잡도 O(n*m) ... n = 장르 종류 수, m = 장르의 곡 수
    public int[] solution(String[] genres, int[] plays) {
        
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> total_plays = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> index_map = new HashMap<>();


        for (int i = 0; i < genres.length; i++) {
            if (total_plays.containsKey(genres[i])) {
                total_plays.put(genres[i],total_plays.get(genres[i])+plays[i]);
                index_map.get(genres[i]).put(i,plays[i]);
            }else{
                total_plays.put(genres[i],plays[i]);
                index_map.put(genres[i],new HashMap<>());
                index_map.get(genres[i]).put(i,plays[i]);
            }
        }

        List<String> list = new ArrayList<>(total_plays.keySet());0
        list.sort((v1, v2) -> total_plays.get(v2).compareTo(total_plays.get(v1)));
        for (String s : list) {
            List<Integer> keySet = new ArrayList<>(index_map.get(s).keySet());
            keySet.sort((v1,v2)-> index_map.get(s).get(v2).compareTo(index_map.get(s).get(v1)));
            int count = 0;
            for (Integer i : keySet) {
                if(count < 2){
                    result.add(i);
                    count++;
                }else{
                    break;
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}