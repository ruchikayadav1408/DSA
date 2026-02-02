// User function Template for Java

class Solution {
    public int countFriendsPairings(int n) {
        // code here
        int fnm1=countFriendsPairings(n-1);
        int fnm2= countFriendsPairings(n-2);
        
        int pairways= (n-1)*fnm2;
        int totalways= fnm1+pairways;
        
        return totalways;
    }
}
