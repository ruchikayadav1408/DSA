/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int multiply;
		
		for(int i=1;i<=10;i++){
		    multiply = n*i;
		    System.out.println( n + " X " + i + " = " + multiply);
		}
	}
}
