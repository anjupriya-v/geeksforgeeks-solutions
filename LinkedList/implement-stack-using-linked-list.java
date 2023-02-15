class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        StackNode sn=new StackNode(a);
        sn.next=top;
        top=sn;
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        int result=0;
        if(top==null){
            return -1;
        }
        result=top.data;
        top=top.next;
        return result;
    }
}
