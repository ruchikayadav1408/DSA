// Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
// Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
// Explanation: 

// Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
// Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
// Explanation: Applying same technique as shown above.

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        
        
        int startrow=0;
        int startcol=0;
        int endrow= mat.length-1;
        int endcol= mat[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            
            for(int j=startcol;j<=endcol;j++){
                ans.add(mat[startrow][j]);
            }
            //right
            
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(mat[i][endcol]);
            }
            //bottom
            
            for(int j=endcol-1;j>=startcol;j--){
               
                if(startrow==endrow){
                    break;
                }
                ans.add(mat[endrow][j]);
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                
                ans.add(mat[i][startcol]);
            }
            
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return ans;
    }
}
