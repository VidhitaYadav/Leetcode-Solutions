class Solution {
    public String longestPalindrome(String str) {
       int start = 0, end = 0;
        for (int center = 0; center < str.length(); center++) {
            int lenOdd = expandFromCenter(str, center, center);
            int lenEven = expandFromCenter(str, center, center + 1);
            int maxLen = Math.max(lenOdd, lenEven);
            if (maxLen > end - start) {
                start = center - (maxLen - 1) / 2;
                end = center + maxLen / 2;
            }
        }
        return str.substring(start, end + 1);
    }
    private int expandFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    
}