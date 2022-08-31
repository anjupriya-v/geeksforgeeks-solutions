/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        Node last=head;
        Node temp=head;
        Node nextNode=head.next;
        while(last.next!=null){
            last=last.next;
        }
        for(int i=0;i<k;i++){
            Node n=new Node(temp.data);
            temp.next=null;
            temp=nextNode;
            last.next=n;
            last=last.next;
            nextNode=nextNode.next;
        }
        return temp;
    }
}
