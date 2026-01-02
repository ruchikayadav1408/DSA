// Example:
// Input:
// 1
// 3
// 1 2 3 4 5 6 7 8 9

// Output:
// 15

// Explanation:
// Testcase 1: Sum of diagonal elements are: 1+5+9 = 15.

class Solution {
    int sumDiagonal(int N, int[][] M) {
        // Write your code here
          int sum=0;
        for(int i=0;i<M.length;i++){
            //primary sum
            sum+=M[i][i];
            
         
        }
        return sum;
    }
}
