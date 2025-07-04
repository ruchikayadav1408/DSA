//283. Move Zeroes
// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
            for(int k=j;k<nums.length;k++){
                nums[k]=0;
            }
        }
    }
