import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int low=0;
        int result=0;
        for(int high=0;high<n;high++){
            while(nums[high]>(long)k*nums[low]){
                low++;
            }
            result=Math.max(result,high-low+1);
        }
        return n-result;
    }
}