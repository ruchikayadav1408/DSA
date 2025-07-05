//7. Reverse Integer
// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321


class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x>0 || x<0){
            int ld= x%10;
            rev= (rev*10) + ld;
            x=x/10;
        }

        if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}
