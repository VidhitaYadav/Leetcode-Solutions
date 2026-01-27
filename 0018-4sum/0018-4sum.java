class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int r=n-1;
                long val=(long)target-nums[i]-nums[j];
                while(l<r){
                    long sum=(long)nums[l]+nums[r];
                    if(sum==val){
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    }else if(sum<val){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        list.addAll(set);
        return list;
    }
}