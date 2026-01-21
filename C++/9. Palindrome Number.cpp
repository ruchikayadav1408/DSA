
// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.


class Solution {
public:
    bool isPalindrome(int x) {
        long int rev=0;
        int n=x;
        while(n>0){
            int last_digit= n%10;
            rev= (rev*10) + last_digit;
            n=n/10;
        }

        if(rev==x){
            return true;

        }
        else{
            return false;
        }
    }
};
