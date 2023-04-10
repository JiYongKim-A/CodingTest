import java.util.*;
import java.util.stream.Collectors;
class Solution {
    // 시간복잡도 O(n! * n^2)
     public int solution(String numbers) {
        String[] split = numbers.split("");
        Set<Integer> set = getPermutation(split).stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toSet());
        
        int count = 0;
        for (Integer i : set) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 소수 판별
    public boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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