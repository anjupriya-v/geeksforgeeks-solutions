//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node slow=null;
        Node fast=head.next;
        Node current=head;
        while(current!=null){
            current.next=slow;
            slow=current;
            current=fast;
            if(current==null){
                break;
            }
            fast=fast.next;
        }
        return slow;
    }
}
