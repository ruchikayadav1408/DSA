
// Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4
public class Main
{

   public static int solution(int arr[], int target){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               return i;
           }
       }
       return -1;
   }
	public static void main(String[] args) {
		int nums[]= {4,  5, 6, 7, 0, 1, 2};
		int target=3;
	    int ans= solution(nums, target);
	    System.out.print(ans);
	}
}
