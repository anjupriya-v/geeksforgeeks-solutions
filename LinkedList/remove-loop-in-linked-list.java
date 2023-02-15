/*
class Node
{
    int data;
    Node next;
}
*/
class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node fast=head;
        Node slow=null;
        int flag=0;
        HashSet<Node> set=new HashSet<Node>();
        while(fast!=null){
            if(!set.contains(fast)){
                set.add(fast);
                slow=fast;
                fast=fast.next;
            }
            else{
               slow.next=null;
               break;
            }
        }
    }
}
