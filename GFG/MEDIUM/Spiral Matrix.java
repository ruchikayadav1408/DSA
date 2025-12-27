// // User function Template for Java
// input: 
// N = 3, M = 3, K = 4
// A[] = {{1, 2, 3}, 
//        {4, 5, 6}, 
//        {7, 8, 9}}
// Output: 
// 6
// Explanation: Spiral traversal of matrix: 
// {1, 2, 3, 6, 9, 8, 7, 4, 5}. Fourth element
// is 6.
class Solution {

    public int findK(int mat[][], int n, int m, int k) {
        // Your code goes here
        
        int ans=0;
        int count=0;
        int startrow=0;
        int startcol=0;
        int endrow= mat.length-1;
        int endcol= mat[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            
            for(int j=startcol;j<=endcol;j++){
                count++;
               if(count==k){
                   ans=mat[startrow][j];
                  
               }
            }
            //right
            
            for(int i=startrow+1;i<=endrow;i++){
                count++;
                if(count==k){
                   ans=mat[i][endcol];
                  
               }
               
            }
            //bottom
            
            for(int j=endcol-1;j>=startcol;j--){
                 count++;
                 
                if(startrow==endrow){
                    break;
                }
                if(count==k){
                   ans=mat[endrow][j];
                  
               }
                
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                  count++;
                if(startcol==endcol){
                    break;
                }
                 if(count==k){
                   ans=mat[i][startcol];
                  
               }
               
            }
                
            
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return ans;
        
    }
}
