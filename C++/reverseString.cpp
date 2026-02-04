// User function Template for C++
class Solution {
  public:
    string reverseString(string& s) {
        // code here
            
    string newstr="";
    for(int i=0;i<s.length();i++){
        char ch =s[i];
        newstr= ch+newstr;
    }
    
    
    return newstr;
    }
};
