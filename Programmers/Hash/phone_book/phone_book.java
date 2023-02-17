import java.util.*;
class Solution {
    // 시간 복잡도 = O(n*m) ... n = phone_book.length, m = phone_book 요소의 문자열 길이
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < phone_book.length; i++)
            set.add(phone_book[i]);

        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length()-1; j++){
                if (set.contains(phone_book[i].substring(0, j)))
                    return false;

                System.out.println(phone_book[i].substring(0, j));
            }
        return true;
    }
    
}