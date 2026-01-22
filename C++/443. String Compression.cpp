// Example 1:

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
class Solution {
public:
    int compress(vector<char>& chars) {
        int ans=0;
   vector<char>str;
        for(int i=0;i<chars.size();i++){
              int count=1;
            while( i<chars.size()-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }

            str.push_back(chars[i]);
           
             if(count>1){
                string s = to_string(count);
               for(char c:s){
                str.push_back(c);
               }
             }
        }
          
 for (int i = 0; i < str.size(); i++) {
            chars[i] = str[i];
        }

        return str.size();
    

    }
};
