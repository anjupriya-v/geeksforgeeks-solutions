/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    int count(Node head){
        int countValue=0;
        while(head!=null){
            countValue++;
            head=head.next;
        }
        return countValue;
    }
    int getIntersectionData(int data,Node head1,Node head2){
        for(int i=0;i<data;i++){
            if(head1==null){
                return -1;
            }
            head1=head1.next;
        }
        while(head1!=null && head2!=null){
            if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return -1;
    }
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
	    int count1=count(head1),count2=count(head2),d=0;
	    if((count1-count2)>0){
	        d=count1-count2;
	        return getIntersectionData(d,head1,head2);
	    }
	    else{
	        d=count2-count1;
	        return getIntersectionData(d,head2,head1);
	    }
	}
}
