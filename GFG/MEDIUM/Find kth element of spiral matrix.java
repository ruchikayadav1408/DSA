
// Given a matrix with n rows and m columns.
//   Your task is to find the kth element which is obtained while traversing the matrix 
//   spirally. You need to complete the method findK which takes four arguments the first
//   argument is the matrix A and the next two arguments will be n and m denoting the size
//   of the matrix A and then the forth argument is an integer k. The function will
//   return the kth element obtained while traversing the matrix spirally.

// Example 1:

// Input:
// n = 4, m = 4, k = 10
// A[][] = {{1  2  3  4},
//          {5  6  7  8},
//          {9  10 11 12},
//          {13 14 15 16}}
// Output:
// 13
// Explanation:

// The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. 
//   So the 10th element in this order is 13. 
class Solution {
    /* You are required to complete this method */
    int findK(int mat[][], int n, int m, int k) {
        // Edge cases for invalid K
        if (k < 1 || k > n * m) return -1;

        int top = 0, left = 0;
        int bottom = n - 1, right = m - 1;
        int count = 0;

        while (top <= bottom && left <= right) {
            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                count++;
                if (count == k) return mat[top][j];
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                count++;
                if (count == k) return mat[i][right];
            }

            // Bottom row: right-1 -> left (only if there is more than one row)
            if (top < bottom) {
                for (int j = right - 1; j >= left; j--) {
                    count++;
                    if (count == k) return mat[bottom][j];
                }
            }

            // Left column: bottom-1 -> top+1 (only if there is more than one column)
            if (left < right) {
                for (int i = bottom - 1; i > top; i--) {
                    count++;
                    if (count == k) return mat[i][left];
                }
            }

            // Move to the inner layer
            top++; left++; bottom--; right--;
        }

        // Should not reach here if k is valid
        return -1;
    }
}

