import java.util.*;
class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int freq : hm.values()) {
                    max = Math.max(max, freq);
                    min = Math.min(min, freq);
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}