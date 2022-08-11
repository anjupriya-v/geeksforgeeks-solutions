/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	Node first=head;
	Node last=head;
	boolean result=false;
	HashSet<Node> hs=new HashSet<Node>();
	if(first==null){
	    return true;
	}
	while(last!=null){
	    if(hs.contains(last)){
	        result=true;
	        break;
	    }
	    else{
	        hs.add(last);
	    }
	    last=last.next;
	}
	if(result==false){
	    return result;
	}
	return result;

    }
}
