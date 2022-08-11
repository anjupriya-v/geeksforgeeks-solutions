/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       int result=0;
       while(ind>0){
           result=node.data;
           node=node.next;
           ind--;
       }
       return result;
    }
}
