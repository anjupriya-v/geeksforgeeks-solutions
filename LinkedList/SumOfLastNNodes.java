/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    //Return the sum of last k nodes
    static int len(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public int sum(Node head, int k){
      int n=len(head)-k,sum=0;
      Node temp=head;
      while(n>0){
          temp=temp.next;
          n--;
      }
      while(temp!=null){
          sum+=temp.data;
          temp=temp.next;
      }
      return sum;
    }
}
