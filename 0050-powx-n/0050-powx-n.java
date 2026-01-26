
class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return power(x,n);
    }
    public static double power(double x , int n){
            if(n==0){
            return 1;
        }
       
        double halfPower=power(x,n/2);
        double halfPowSquare=halfPower*halfPower;
        if(n%2!=0){
            return x*halfPowSquare;
        }
        return halfPowSquare;

    }
}