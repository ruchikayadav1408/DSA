// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.


class Solution {
public:
    int strStr(string haystack, string needle) {
        
       return haystack.find(needle);
}
};
