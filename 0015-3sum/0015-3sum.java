import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            int target=-nums[i];
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==target){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
           
        }
        list.addAll(set);
        return list;
    }
}