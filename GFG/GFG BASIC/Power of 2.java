class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here9
        return n>0 && (n&(n-1))==0;
    }
}
