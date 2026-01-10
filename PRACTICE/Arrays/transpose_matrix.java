/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
    
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("{ " + i + ","+ j+" }");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int row=2,  col=3;
		int arr[][]= {{1,2,3}, {4,5,6}};
		  System.out.println("Original matrix : ");
		print(arr);
		int transpose[][]= new int[col][row];
		
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        transpose[j][i]=arr[i][j];
		        
		    }
		}
		  System.out.println("transpose matrix : ");
		print(transpose);
		
	}
}
