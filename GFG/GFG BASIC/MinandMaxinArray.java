// Min and Max in Array
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
       
       
       int min= Integer.MAX_VALUE;
       int max= Integer.MIN_VALUE;
       
       
       ArrayList<Integer> al= new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max= arr[i];
           }
           if(arr[i]<min){
               min= arr[i];
           }
       }
       
       al.add(min);
        al.add(max);
        
        return al;
    }
}
