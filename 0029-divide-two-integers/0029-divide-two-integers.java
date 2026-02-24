class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isPositive = (dividend >= 0) == (divisor >= 0);
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;
        while (n >= d) {
            long temp = d, multiple = 1;
            while (n >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            n -= temp;
            ans += multiple;
        }
        ans = isPositive ? ans : -ans;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) ans;
    }
}
