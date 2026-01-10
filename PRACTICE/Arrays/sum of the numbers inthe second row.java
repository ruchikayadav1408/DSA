/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Print out the sum of the numbers inthe second row of the “nums”
// array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
public class Main
{
    
    
    public static int solution(int arr[][]){
        int sum=0;
       
           for(int j=0;j<arr[0].length;j++){
              
               sum+=arr[1][j];
           }
       
        
        return sum;
    }
	public static void main(String[] args) {
	int[][] arr = { {1,4,9},{11,4,3},{2,2,3} };
	int ans=solution(arr);
	
	System.out.print(ans);
	}
}
