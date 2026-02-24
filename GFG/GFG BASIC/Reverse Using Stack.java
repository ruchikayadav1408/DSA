class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st= new Stack<>();
        
        int i=0;
        while(i<S.length()){
            st.push(S.charAt(i));
            i++;
        }
        
        
        StringBuilder sb= new StringBuilder("");
        
        while(!st.isEmpty()){
            char curr=st.pop();
            sb.append(curr);
        }
        
        return sb.toString();
    }
}
