/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	Node temp=head;
	Node prev=null;
	List<Integer> list=new ArrayList<Integer>();
	while(temp!=null){
	    if(!list.contains(temp.data)){
	        list.add(temp.data);
	        prev=temp;
	        temp=temp.next;    
	    }
	    else{
	        temp=temp.next;
	        prev.next=temp;
	    }
	   }
	return head;
    }
}
