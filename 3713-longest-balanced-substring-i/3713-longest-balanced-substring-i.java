class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int maxLen=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>freq=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                if(isBalanced(freq)){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public boolean isBalanced(HashMap<Character,Integer>freq){
        int val=-1;
        for(int count:freq.values()){
            if(val==-1){
                val=count;
            }else if(count!=val){
                return false;
            }
        }
        return true;

    }
}