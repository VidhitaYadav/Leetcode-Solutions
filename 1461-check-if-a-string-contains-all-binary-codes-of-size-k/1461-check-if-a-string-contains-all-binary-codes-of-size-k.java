class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need=1<<k
        if(s.length()<need)return false;
        boolean[] seen=new boolean[need];
        int count=0;
        int hash=0;
        for(int i=0;i<s.length();i++){
            hash=((hash<<1)&(need-1))|(s.charAt(i)-'0');
            if(i>=k-1 && !seen[hash]){
                seen[hash]=true;
                count++;
                if(count==need)return true;
            }
        }
        return false;

    }
}