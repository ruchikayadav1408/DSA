/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
         Node slow=head;
        Node fast= head;

        boolean cycle= false;

        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast= fast.next;

            if(slow== fast){
                cycle=true;
                break;
            }
        }

        if(cycle==false){
            return;
        }

        //find meeting point
        slow= head;
        Node prev= null;

        while(slow!=fast){
            prev= fast;
            slow=slow.next;
            fast=fast.next;
        }


        prev.next=null;
    }
}
