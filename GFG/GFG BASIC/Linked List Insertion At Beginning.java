/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
         Node  newnode= new Node(x);
         if(head==null){
             head= newnode;
              return head;
         }
         newnode.next=head;
         head= newnode;
         
         return head;
    }
}
