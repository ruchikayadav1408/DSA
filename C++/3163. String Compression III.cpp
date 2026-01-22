// Example 1:

// Input: word = "abcde"

// Output: "1a1b1c1d1e"

// Explanation:

// Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.

// For each prefix, append "1" followed by the character to comp.

class Solution {
public:
    string compressedString(string word) {
         int ans=0;
      string str="";
        for(int i=0;i<word.size();i++){
              int count=1;
            while( i<word.size()-1 && word[i]==word[i+1]){
                count++;
                i++;
            }

          // string s = to_string(count);
           while(count>9){
            str+='9';
             str+=word[i];
            count=count-9;
           }
          string s = to_string(count);
            str+=s;
           str+=word[i];
        
        }
        return str;
    
    }
};
