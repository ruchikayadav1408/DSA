//162. Find Peak Element
// Example 1:

// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.

class Solution {
    public int findPeakElement(int[] nums) {
        int n= nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i;
            }
        }

        return n-1;
    }
}
