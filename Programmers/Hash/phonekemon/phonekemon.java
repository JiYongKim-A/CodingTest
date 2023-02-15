import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        //가질 수 있는 포켓몬 수
        int max= nums.length/2;
        HashSet set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        // 포켓몬의 종류 수
        int kind = set.size();

        if(kind >= max){
            return max;
        } else {
            return kind;
        }
    }
}