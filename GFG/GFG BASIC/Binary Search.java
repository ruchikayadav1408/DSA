// Input: arr[] = [1, 2, 3, 4, 5], k = 4
// Output: 3
// Explanation: 4 appears at index 3.


class Solution {
    public int binarysearch(int[] arr, int key) {
       int start=0 , end=arr.length-1;
        int ans=-1;
        while(start <= end){
            int mid=(start+end)/2;
            
             if(arr[mid]== key){
                 ans= mid;
                 end= mid-1;
                 
             }
             else if(arr[mid]>key){
                 end= mid-1;
             }
             else{
                 start=mid+1;
             }
        }
        return ans;
    }
}




