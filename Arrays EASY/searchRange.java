//34. Find First and Last Position of Element in Sorted Array
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                ans[1]=j;
                break;
            }
        }

        return ans;
    }
}
