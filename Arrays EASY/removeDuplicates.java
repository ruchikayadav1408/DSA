//26. Remove Duplicates from Sorted Array
//Example 1:

//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

class Solution {
    public int removeDuplicates(int[] arr) {
      // To track seen elements
        HashSet<Integer> s = new HashSet<>();
        
        // To maintain the new size of the array
        int idx = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) { 
                s.add(arr[i]);  
                arr[idx++] = arr[i];  
            }
        }

        // Return the size of the array 
        // with unique elements
        return idx;
    }
}
