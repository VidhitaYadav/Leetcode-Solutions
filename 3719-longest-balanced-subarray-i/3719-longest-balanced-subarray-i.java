import java.util.*;
class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int maxLen=0;
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                sum++;
            }else{
                sum--;
            }
             if(hm.containsKey(sum)){
                int length = i - hm.get(sum);
                maxLen = Math.max(maxLen, length);
            } else {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }
}