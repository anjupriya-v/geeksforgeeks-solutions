//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	  Node second=null;
	  Node temp=null;
	  Node first=head;
	  int pos=x;
	  if(pos==1){
	      head=first.next;
	      head.prev=null;
	      return head;
	  }
	  while(pos>0){
	      if(pos==1){
	          temp=first.next;
	          second.next=temp;
	  }
	  	  second=first;
	      first=first.next;
	  pos--;
	  }
	  return head;
    }
}
