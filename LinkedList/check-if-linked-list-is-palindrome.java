/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Stack<Integer> stack=new Stack<Integer>();
        boolean flag=true;
        Node temp1=head;
        while(temp1!=null){
            stack.push(temp1.data);
            temp1=temp1.next;
        }
        Node temp2=head;
        while(temp2!=null){
            if(temp2.data!=stack.pop()){
                flag=false;
                break;
            }
            temp2=temp2.next;
        }
        return flag;
    }    
}
