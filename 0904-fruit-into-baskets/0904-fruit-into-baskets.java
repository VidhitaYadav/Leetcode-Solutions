class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int maxLen=0;
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int r=0;r<n;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            if(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])!=null && hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}