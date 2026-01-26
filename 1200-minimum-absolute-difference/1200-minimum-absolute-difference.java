import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        int n=arr.length;
        List<List<Integer>>list=new ArrayList<>();   
        for(int i=0;i<n-1;i++){
            minDiff=Math.min(arr[i+1]-arr[i],minDiff);
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==minDiff){
                List<Integer>pair=new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);
            }
        }
        
        return list;   
    }
}
