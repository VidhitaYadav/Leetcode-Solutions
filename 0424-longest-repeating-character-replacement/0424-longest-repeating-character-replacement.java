import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxLen=0,maxFreq=0;
        int n=s.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq,hm.get(ch));
            while((r-l+1)-maxFreq>k){
                char chl=s.charAt(l);
                hm.put(chl,hm.get(chl)-1);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}