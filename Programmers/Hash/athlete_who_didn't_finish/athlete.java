import java.util.*;
class Solution {
    // 시간 복잡도 O(n) ... n = participant.length - 1 
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int index = 0 ;
        while(true){
            if(index == participant.length-1){
                return participant[index];
            }
            if(!participant[index].equals(completion[index])){
                return participant[index];
            }
            index++;
        }
    }
}