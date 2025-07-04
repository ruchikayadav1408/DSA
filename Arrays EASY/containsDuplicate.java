//217. Contains Duplicate
// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hm.contains(nums[i])){
               return true;
            }
            else{
                 hm.add(nums[i]);
            }
        }

        return false;
    }
}
