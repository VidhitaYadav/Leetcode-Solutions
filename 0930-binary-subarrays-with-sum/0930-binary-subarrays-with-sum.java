class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);    
    }
    public static int atMost(int[] nums,int k){
        if(k<0)return 0;
        int n=nums.length;
        int count=0;
        int l=0,sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }count+=(r-l+1);
        }
        return count;
    }
}