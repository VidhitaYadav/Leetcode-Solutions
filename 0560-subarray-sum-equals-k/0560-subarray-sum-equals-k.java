import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int prefixSum=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            int remove=prefixSum-k;
            if(hm.containsKey(remove)){
                count+=hm.get(remove);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}