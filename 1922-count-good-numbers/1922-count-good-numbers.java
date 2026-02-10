class Solution {
    static final long mod=1000000007;
    public int countGoodNumbers(long n) {
        long evenPower=(n+1)/2;
        long oddPower=n/2;
        long evenPart=modPow(5,evenPower);
        long oddPart=modPow(4,oddPower);
        return (int)((evenPart*oddPart)%mod);

    }
    public static long modPow(long base,long exp){
        long result=1;
        base%=mod;
        while(exp>0){
            if((exp&1)==1){
                result=(result*base)%mod;
            }
            base=(base*base)%mod;
            exp>>=1;
        }
        return result;
    }
}