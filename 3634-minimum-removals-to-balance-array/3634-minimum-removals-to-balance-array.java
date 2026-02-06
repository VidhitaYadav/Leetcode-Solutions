import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        if(n<2)return 0;
        Arrays.sort(nums);
        int low=0;
        int result=0;
        for(int high=0;high<n;high++){
            while(low<right&&(long)nums[high]>(long)k*nums[low]){
                low++;
            }
            result=Math.max(result,high-low+1);
        }
        return n-result;
    }
}