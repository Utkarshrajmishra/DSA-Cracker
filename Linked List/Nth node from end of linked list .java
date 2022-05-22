class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int len=count(head);
    	len=len-(n-1);
    	Node temp=head;
    	while(len-->=0)
    	{
    	    if(len==0)
    	    {
    	        return temp.data;
    	    }
    	    temp=temp.next;
    	}
    	return -1;
    }
    
    int count(Node head)
    {
        int counter=0;
        Node n=head;
        while(n!=null)
        {
            counter++;
            n=n.next;
        }
        return counter;
    }
}
