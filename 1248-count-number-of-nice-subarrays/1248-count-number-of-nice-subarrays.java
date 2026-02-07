class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums,k)-atMostK(nums,k-1);
    }
    public static int atMostK(int[] nums,int k){
        int l=0,odd=0,result=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[l]%2!=0){
                    k++;
                }
                l++;
            }
            result+=(r-l+1);
        }
        return result;
    }
}