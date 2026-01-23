/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Count how many times lowercase vowels occurred in  a String entered by the
// user
public class Main
{
	public static void main(String[] args) {
		int count=0;
		String str="ApplE";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)  =='i'|| 
		    str.charAt(i) == 'o'|| str.charAt(i) =='u'){
		        count++;
		    }
		}
		System.out.print("vowels :" + count);
	}
}
