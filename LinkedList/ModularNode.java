/*node class of the linked list is as:
class Node {
	int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class GfG
{
    public static int moduarNode(Node head, int k)
    {
        int result=0,index=1;
        Node temp=head;
        while(temp!=null){
            if(index%k==0){
                result=temp.data;
            }
            temp=temp.next;
            index++;
        }
        if(result==0){
            result=-1;
        }
        return result;
    }
}
