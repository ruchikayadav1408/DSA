//58. Length of Last Word
//Given a string s consisting of words and spaces, return the length of the last word in the string.

//A word is a maximal substring consisting of non-space characters only.
/*Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0){
                    return count;
                }
            }
        }

        return count;
    }
}
