import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxLen=0,maxFreq=0;
        int n=s.length();
        int[] arr=new int[26];
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            arr[ch-'A']++;
            maxFreq = Math.max(maxFreq,arr[ch-'A']);
            while((r-l+1)-maxFreq>k){
                char chl=s.charAt(l);
                arr[chl-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}