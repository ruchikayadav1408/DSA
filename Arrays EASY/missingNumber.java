//268. Missing Number
Example 1:

// Input: nums = [3,0,1]

// Output: 2

// Explanation:

// n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
//2 is the missing number in the range since it does not appear in nums.

class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        int expected_sum= (n*(n+1))/2;
        int diff=expected_sum - sum;
        return diff;
    }
}
