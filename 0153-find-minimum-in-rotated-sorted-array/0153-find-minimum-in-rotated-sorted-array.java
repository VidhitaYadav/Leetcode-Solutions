class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int curr;
        for(int i=0;i<nums.length;i++){
            curr=nums[i];
            min=Math.min(curr,min);
            }
        return min;
    }
}