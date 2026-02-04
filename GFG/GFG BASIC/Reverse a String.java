// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        
       
    String newstr="";
    for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        newstr= ch+newstr;
    }
    
    
    return newstr;
}
}
