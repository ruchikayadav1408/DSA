// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// For a given integer array of sizeN.
// You have to find  all the occurrences(indices) of  a given element(Key)
// and print them. Use a recursive function to solve this problem.
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
// Sample Output: 1 5 7 8
public class Main
{
    
   public static void index(int arr[], int i, int key){
        int n=arr.length;
       int ans[]= new int[n];
     
       if(i==n){
           return;
       }
       if(arr[i]==key){
          System.out.print(i+ " ");
           
       }
       
       
       index(arr, i+1 , key);
   }
	public static void main(String[] args) {
		int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
		int key = 2;
		index(arr, 0, key);
		
	}
}
