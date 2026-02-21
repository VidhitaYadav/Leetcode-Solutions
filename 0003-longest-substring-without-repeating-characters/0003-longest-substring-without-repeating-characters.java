import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       int maxLen=0;
       int l=0,r=0;
       int len=0;
       HashSet<Character>set=new HashSet<>();
       while(r<n){
        char ch=s.charAt(r);
        if(set.contains(ch)){
            len=r-l+1;
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
                
            }       
        }
        maxLen=Math.max(r-l+1,maxLen);
        set.add(ch);
        r++;
        
       }
       return maxLen;
    }
}




