class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
         Stack<Integer> s= new Stack<>();

    ArrayList<Integer> al= new ArrayList<>();

     int nextgreater[]= new int[arr.length];
     for(int i=0;i<=arr.length-1;i++){

        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
            s.pop();
        }


        if(s.isEmpty()){
         nextgreater[i]=-1;
        }else{
            nextgreater[i]=arr[s.peek()];
        }

        s.push(i);
     }   
     
     
     ArrayList<Integer> list = new ArrayList<>();
        
        for(int a : nextgreater) {
            list.add(a);
        }
        
        return list;
    }
        
    
}
