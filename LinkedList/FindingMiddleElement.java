/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int count(Node head){
        int countValue=0;
        while(head!=null){
            head=head.next;
            countValue++;
        }
        return countValue;
    }
    int getMiddle(Node head)
    {
        Solution s=new Solution();
        Node tempNode=head;
        int len=s.count(head),result=0;
        int temp=(len/2)+1;
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
