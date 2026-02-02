class Solution {
    public int search(int[] nums, int target) {
        int bin = Arrays.binarySearch(nums,target);
        return bin<0 ? -1 : bin;
        
    }
}