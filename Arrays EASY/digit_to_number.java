// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.
// Use a recursive function to solve this problem.
// NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
// Sample Input: 1947Sample Output: “one nine four seven”

public class Main
{
    
   public static void number(int n){
       String digit[]={"zero", "one", "two", "three", "four",
       "five", "six", "seven", "eight", "nine"};
       
       if(n==0){
           return;
       }
       int ld= n%10;
       
       number(n/10);
       System.out.print(digit[ld]+" ");
       
       
   }
	public static void main(String[] args) {
		int n=9876;
		number(n);
	}
}
