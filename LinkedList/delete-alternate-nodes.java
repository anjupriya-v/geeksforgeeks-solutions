/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    
    public void deleteAlternate (Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow.next=fast;
            slow=fast;
        }
    }
}
