// Input: mat[][] = [[1, 1, 1, 1],
//                 [2, 2, 2, 2],
//                 [3, 3, 3, 3],
//                 [4, 4, 4, 4]]
// Output: [[1, 2, 3, 4],
//        [1, 2, 3, 4],
//        [1, 2, 3, 4],
//        [1, 2, 3, 4]]
Explanation: Converting rows into columns and columns into rows.
class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> al= new  ArrayList<>();
      
        int row=mat.length;
        int col=mat[0].length;
        
        int transpose[][]= new int[col][row];
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        transpose[j][i]=mat[i][j];
		        
		    }
		}
		
	
		for(int i=0;i<row;i++){
		    	ArrayList<Integer> ans= new ArrayList<>();
		    for(int j=0;j<col;j++){
		        ans.add(transpose[i][j]);
		    }
		    	al.add(ans);
		}
	
		return al;
    }
}
