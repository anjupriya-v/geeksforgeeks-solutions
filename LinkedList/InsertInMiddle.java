/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    static int len(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public Node insertInMid(Node head, int data){
        Node n=new Node(data);
        Node first=head;
        Node second=null;
        int mid= (1+len(head))/2;
        while(mid>0){
            second=first;
            first=first.next;
            mid--;
        }
        second.next=n;
        n.next=first;
        return head;
    }
}
