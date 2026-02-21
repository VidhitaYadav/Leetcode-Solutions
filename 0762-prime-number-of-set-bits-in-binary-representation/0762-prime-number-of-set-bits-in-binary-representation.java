class Solution {
    public int countPrimeSetBits(int left, int right) {
        int finalCount=0;
        for(int i=left;i<=right;i++){
            int val=countSetBit(i);
            if(isPrime(val)){
                finalCount++; 
            }
        }
        return finalCount;
    }
    public int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0)count++;
            n=n>>1;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}