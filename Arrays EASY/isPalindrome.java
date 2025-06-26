// //9. Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        //create variable for storing x value in n 
        int n=x;
        int rev=0;
        //reverse number
        while(x>0){

            int ld= x%10; // give last digit
            rev= (rev*10) + ld;
            x=x/10;  // remove last digit
        }
        //check reverse num equal to original number
        if(rev==n){
            return true;
        }
        else{
            return false;
        }
    }
}
