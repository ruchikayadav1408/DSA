// User function Template for Java

class Solution {
    ArrayList<String> list= new ArrayList<>();
    public ArrayList<String> permutation(String S) {
        // Your code here
        
         char[] arr=S.toCharArray();
         Arrays.sort(arr);
        findper(new String(arr) , "");

         return list;
        
    }
    
    public  void findper(String str, String ans){
        
        if(str.length()==0){
            list.add(ans);
            return ;
        }
        
        HashSet<Character> used= new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            if(used.contains(curr))continue;
            
            used.add(curr);
            String newstr= str.substring(0,i)+ str.substring(i+1);
            findper(newstr, ans+curr);
        }
    }
}
