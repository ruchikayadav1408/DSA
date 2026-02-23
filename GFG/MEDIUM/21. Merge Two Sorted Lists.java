/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node list1, Node list2) {
        // code here
         Node mergell= new Node(-1);
        Node temp= mergell;

        while(list1 !=null && list2!=null){
            if(list1.data <=list2.data){
                temp.next=list1;
                list1= list1.next;
                temp=temp.next;
        }
        else{
                temp.next=list2;
                list2= list2.next;
                temp=temp.next;
        }
        }

        while(list1 !=null){
            temp.next=list1;
                list1= list1.next;
                temp=temp.next;
        }

          while(list2 !=null){
            temp.next=list2;
                list2= list2.next;
                temp=temp.next;
        }


        return mergell.next;
    }
}
