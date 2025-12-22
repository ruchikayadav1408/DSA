// Kadane's Algorithm
// You are given an integer array arr[]. You need to find the maximum sum of a subarray
//(containing at least one element) in the array arr[].

// Note : A subarray is a continuous part of an array.

// Examples:

// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
import java.util.*;
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int cs=0;
        int cnt=0;
        int ms=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            cs =cs + arr[i];
            if(cs<0){
                cs=0;
            }
            if(arr[i]<0){
               cnt++;
               min=Math.min(Math.abs(arr[i]),min);
             }
           
             ms= Math.max(cs, ms);
        }
   
        if(cnt==arr.length){
           return -(min);
         }
        return ms;
    }
}
