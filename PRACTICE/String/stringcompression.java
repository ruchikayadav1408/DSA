/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static String compression(String str){
        
        String newstr="";
      //aaabccd
      //abc
        for(int i=0;i<str.length();i++){
              Integer count=1;
              while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                  count++;
                  i++;
              }
              
              newstr+=str.charAt(i);
              
              if(count>1){
                  newstr+=count.toString();
              }
              
              
              
        }
        
        return newstr;
    }
	public static void main(String[] args) {
	String str="aaaabbccddd";
	String ans=compression(str);
	
	System.out.print(ans);
	}
}
