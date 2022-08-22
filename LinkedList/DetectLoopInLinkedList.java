//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/
class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
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
               flag=1;
               break;
            }
        }
        if(flag==1){
            return true;
        }
        return false;
    }
}
