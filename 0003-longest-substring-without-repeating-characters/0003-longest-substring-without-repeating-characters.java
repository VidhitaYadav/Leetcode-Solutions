import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] arr = new int[256]; 
        Arrays.fill(arr, -1);     
        int maxLen = 0;
        int left = 0; 
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (arr[c] >= left) {
                left = arr[c] + 1;
            }
            arr[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

