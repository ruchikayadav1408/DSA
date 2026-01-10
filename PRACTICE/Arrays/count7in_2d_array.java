/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
public class Main
{
    
    
    public static int solution(int arr[][]){
        int count=0;
        int row=arr.length, col= arr[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        
        return count;
    }
	public static void main(String[] args) {
	int[][] arr = { {4,7,8},{8,8,7}, {9,9,7} };
	int ans=solution(arr);
	
	System.out.print(ans);
	}
}
