/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 0 if the length of LL is even 
   otherwise return 1.*/
class GFG
{
    static int len(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
	int isLengthEvenorOdd(Node head1)
	{
	    if(len(head1)%2==0){
	        return 0;
	    }
	    return 1;
	}
}
