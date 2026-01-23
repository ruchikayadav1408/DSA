class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
       
        boolean result=false;
        if(s1.length()==s2.length()){
             char str1[]= s1.toCharArray();
           char str2[]= s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            
             result= Arrays.equals(str1, str2);
        }
            
            if(result){
                return  true;
            }
            
            
            return false;
        }
    }
