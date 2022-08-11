/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    static int len(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public boolean isIdentical (Node head1, Node head2){
        boolean bool=true;
        int len1=len(head1);
        int len2=len(head2);
        if(len1==len2){
            while(head1!=null){
                if(head1.data!=head2.data){
                    bool=false;
                    break;
                }
                head1=head1.next;
                head2=head2.next;
            }
        }
        else{
            bool=false;
        }
        return bool;
    }
}
