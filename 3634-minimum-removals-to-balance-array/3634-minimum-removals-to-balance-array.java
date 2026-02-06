import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int j = 0;
        int mx = 0;
        for(int i=0; i<n; i++){
            while(j<i && (long)nums[i]>(long)(k)*nums[j]){
                j++;
            }
            mx = Math.max(mx,i-j+1);
        }
        return n-mx;
    }
}