import java.util.*;
class Solution {
    // 시간복잡도 O(n)... n = s.length()
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == s.charAt(s.length()-1) || s.length()%2==1){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() && c ==')') {
                return false;
            }

            if (c=='(') {
                stack.add(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}