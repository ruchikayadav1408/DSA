// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//add middle 
 public   class Linkedlist{
     public static  class Node{
         int data;
         Node next;
         
         public Node(int data){
             this.data=data;
             this.next= null;
         }
     }
     
     
     public static Node head;
     public static Node tail;
     
     
     public void addfirst(int data){
         Node  newnode= new Node(data);
         if(head==null){
             head=tail= newnode;
             return;
         }
         newnode.next=head;
         head= newnode;
         
     }
     
     public void addlast(int data){
         Node newnode= new Node(data);
         if(head==null){
             head=tail= newnode;
             return;
         }
         
         
         tail.next=newnode;
         tail=newnode;
     }
     public void addmiddle(int idx, int data){
         Node newnode= new Node(data);
         
         Node temp=head;
         int i=0;
         while(i<idx-1){
             temp=temp.next;
             i++;
         }
         
         
         newnode.next=temp.next;
         temp.next=newnode;
     }
     public  void print(){
         Node temp= head;
         while(temp !=null){
             System.out.print(temp.data + "-> ");
             temp=temp.next;
         }
         
         System.out.println("null");
     }
    public static void main(String[] args) {
       Linkedlist ll= new Linkedlist();
      // ll.head= new Node(3);
      // ll.head.next= new Node(4);
       ll.addfirst(4);
       
       ll.addfirst(3);
       
      
        ll.addfirst(2);
       
     
        ll.addfirst(1);
         ll.print();
       ll.addlast(5);
       
       ll.addmiddle(2,10);
       ll.print();
       
    }

}
