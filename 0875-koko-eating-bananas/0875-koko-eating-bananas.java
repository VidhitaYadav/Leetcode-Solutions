import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h){
        long maxPile = 0;
        for (int p : piles) {
            maxPile = Math.max(maxPile, p);
        }
        long low=1;
        long high=maxPile;
        long ans=maxPile;
        while(low<=high){
            long mid=(low+high)/2; 
            long hours=calculateTotalHours(piles, mid);
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
    public long calculateTotalHours(int[] piles, long speed) {
        long totalH = 0;
        for (int p : piles) {
            totalH += (long)(Math.ceil((double)p / speed));
        }
        return totalH;
    } 
}
    

    
    
