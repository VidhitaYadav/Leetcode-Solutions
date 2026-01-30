class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub)&&sub.length()>str.length()){
                str=sub;
                }
            } 
        }
        return str;
    }
    public static boolean isPalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
            
        }
        return true;
    }
}