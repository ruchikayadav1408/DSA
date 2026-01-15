/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// find shortest path 
import java.util.*;

public class Main
{
    
    public static float shortestpath(String path){
        int x=0, y=0;
        int n= path.length();
        for(int i=0;i<n;i++){
            int dir= path.charAt(i);
            
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        
        
        int X2= x*x;
        int Y2= y*y;
        
        return (float)Math.sqrt(X2+Y2);
    }
	public static void main(String[] args) {
		String path="WNEENESENNN";
		
		float ans=shortestpath(path);
		System.out.println(ans);
	}
}
