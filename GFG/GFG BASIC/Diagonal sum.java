// given a square matrix of size n×n. Your task is to calculate the sum of its diagonals.
 

// Example 1:

// Input: matrix = {{1, 1, 1}, 
// {1, 1, 1}, {1, 1, 1}}
// Output: 6

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //primary sum
            sum+=matrix[i][i];
            
            //secondary sum
        // if(i!=matrix.length -i-1){
            sum+=matrix[i][matrix.length -i-1];
        }
        // }
        
        return sum;
    }
}
