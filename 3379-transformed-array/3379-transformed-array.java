class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            int k = i+nums[i];
            if(k<0){
                result[i] = nums[(k%n+n)%n]; 
            } else if(k<n){
                result[i] = nums[k];
            }
            else if(k>=n){
                result[i] = nums[k%n];
            }
        }
        return result;
    }
}
