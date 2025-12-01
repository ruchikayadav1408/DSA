// Array Subset
// Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

// Examples:

// Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
// Output: true
// Explanation: b[] is a subset of a[]


class Solution {
    public boolean isSubset(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        int m = a.length, n = b.length;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                i++;   // move in a to catch up
            }
            else if (a[i] == b[j]) {
                i++;
                j++;   // matched one element from b
            }
            else {
                // a[i] > b[j] → means b[j] is missing
                return false;
            }
        }

        return (j == n); // all b[] matched
    }
}
