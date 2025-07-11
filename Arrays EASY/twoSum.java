
//1. Two Sum
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int arr[]= new int[2];   //result array created

        // traverse in array check with all elements equal to target or not
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                //condition if equal so store index in result array
            if((nums[i]+nums[j])== target)
            {
                arr[0]=i;
                arr[1]=j;
            }
            }
        }
        // return array
           return arr;
    }

 
}
