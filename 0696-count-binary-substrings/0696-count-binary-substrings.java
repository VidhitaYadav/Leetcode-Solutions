class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) continue;
            int j = i;
            char ch = s.charAt(i);
            while (j < n && s.charAt(j) == ch) {
                j++;
            }
            int left = j - i;
            int right = 0;
            while (j < n && s.charAt(j) != ch && right < left) {
                j++;
                right++;
                count++;
            }
        }
        return count;
    }
}
