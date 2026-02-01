// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        int n=s.length();
        return duplicate(s,0,new  StringBuilder(""), new boolean[26]  );
    }
    
    public static String duplicate(String s , int idx, StringBuilder newstr, boolean map[]){
       if(idx==s.length()){
            return newstr.toString();
        }
        
        char curr=s.charAt(idx);
        if(map[curr-'a']==true){
            return duplicate(s, idx+1,newstr,map);
        }
        else{
            map[curr -'a']=true;
           return duplicate(s, idx+1, newstr.append(curr), map);
        }
          
    }
}
