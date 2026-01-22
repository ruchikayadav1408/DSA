// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

class Solution {
public:
    bool isPalindrome(string s) {
        string str="";
      
        for(char i: s){
            if(isalnum(i))
            str+=tolower(i);
        }
          int n= str.size();
        for(int i=0;i<n/2;i++){
            if(str[i] != str[n-i-1]){
                return false;
            }
        }

        return true;
    }
};
