import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            hm1.put(c,hm1.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            char c = s2.charAt(right);
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
            if (right - left + 1 > s1.length()) {
                char remove = s2.charAt(left);
                hm2.put(remove, hm2.get(remove) - 1);
                if (hm2.get(remove) == 0) {
                    hm2.remove(remove);
                }
                left++;
            }
            if (hm2.equals(hm1)) return true;
        }
        return false;
    }
}