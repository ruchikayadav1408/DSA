
// Monotonic ArrayList(EASY)An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.AnArraylistnumsismonotoneincreasingifforalli<=j,nums.get(i)<=nums.get(j).
//AnArraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
// Sample Input 1: nums = [1,2,2,3]Sample Output 1: true
// Sample Input 2: nums = [6,5,4,4]Sample Output 2: true
// Sample Input 3: nums = [1,3,2]Sample Output 3: false
import java.util.*;
class Main {
    
    public static boolean monotonic(ArrayList<Integer> al){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)){
                inc= false;
            }
            if(al.get(i)<al.get(i+1)){
                dec= false;
            }
        }
        
        
        return inc|| dec;
    }
    
   
    public static void main(String[] args) {
       ArrayList<Integer> al=  new ArrayList<>();
       al.add(1);
       al.add(3);
       al.add(2);
      // al.add(4);
       
       
      boolean ans= monotonic(al);
      System.out.print(ans);
      
    }
}
