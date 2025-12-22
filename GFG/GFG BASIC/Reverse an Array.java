// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. 
//   Hence, the answer is [5, 6, 2, 3, 4, 1].

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start=0, end= arr.length-1;
        
        while(start<end){
            int temp= arr[end];
            arr[end]=arr[start];
            arr[start]= temp;
            start++;
            end--;
            
    }
    
    
}
}
