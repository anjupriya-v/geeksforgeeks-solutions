/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    static int count(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    int getNthFromLast(Node head, int n)
    {
    	int temp=(count(head)-n)+1,result=0;
    	Node tempNode=head;
    	if(temp>count(head) || temp<=0){
    	    return -1;
    	}
    	while(true){
    	    if(temp==1){
    	        result=tempNode.data;
    	        break;
    	    }
    	    tempNode=tempNode.next;
    	    temp--;
    	}
    	return result;
    }
}
