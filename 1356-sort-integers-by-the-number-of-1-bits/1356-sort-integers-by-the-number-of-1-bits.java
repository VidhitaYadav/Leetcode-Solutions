import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Integer[] arr2=new Integer[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2,(a,b)->{
            int bitCountA=Integer.bitCount(a);
            int bitCountB=Integer.bitCount(b);
            if(bitCountA==bitCountB){
                return a-b;
            }else{
                return bitCountA-bitCountB;
            }
        });
        for(int i=0;i<n;i++){
            arr[i]=arr2[i];
        }
        return arr2;
        }
    }
