// Input: arr[] = [3, 0, 1, 0, 4, 0 2]
// Output: 10
// Explanation: Total water trapped = 0 + 3 + 2 + 3 + 0 + 2 + 0 = 10 units.

import java.util.*;
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n= arr.length;
        
        
        //calculate left max boundry
        int leftmax[]= new int[n];
        leftmax[0]= arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(arr[i], leftmax[i-1]);
        }
        
        //calculate right max boundry
        int rightmax[]= new int[n];
        rightmax[n-1]= arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(arr[i], rightmax[i+1]);
        }
        
        
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel= Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel- arr[i];
        }
        
        return trappedwater;
    }
}
