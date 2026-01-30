class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            String a=s.toLowerCase();
            String b=t.toLowerCase();
            char[] c=a.toCharArray();
            char[] d=b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            boolean g=Arrays.equals(c,d);
            if(g){
                return true;
            }
        }
        return false;
    }
}