// 349. Intersection of Two Arrays

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set= new HashSet<>();
        Set<Integer> intersect= new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                intersect.add(nums2[i]);
            }
        }
        

        int ans[]= new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            ans[i++] = num;
        }
        return ans;
    }
}
