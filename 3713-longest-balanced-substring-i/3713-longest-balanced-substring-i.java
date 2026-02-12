class Solution {
    public int longestBalan<ced(String s) {
        int n=s.length();
        int maxLen=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Inetger>freq=new HashMap<>();
            for(int j=i;j<n;j++){
                Char ch=s.charAt(j);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                if(isBalanced(freq)){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public boolean isBalanced(HashMap<Character,Inetger>freq){
        int val=-1;
        
    }
}