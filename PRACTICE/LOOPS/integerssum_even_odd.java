/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//   Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int sumeven=0;
		int sumodd=0;
		int choice=1;



		do {

			int n= sc.nextInt();

			//even case
			if(n%2==0) {
				sumeven+=n;

			} else {
				sumodd +=n;
			}

			System.out.println("1 pres for yes or 0 for no:");
			choice= sc.nextInt();


		} while(choice ==1);



		System.out.println("sum even ; " + sumeven);
		System.out.println("sum odd ; " + sumodd);



	}
}
