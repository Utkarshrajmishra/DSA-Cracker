class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	    HashSet <Integer> set=new HashSet<>();
	    Node n=head;
	    if(n!=null)
	    {
	        do{
	            
	            n=n.next;
	            if(n==head)
	            {
	                
	                return true;
	            }
	        }
	        while(n!=null);
	    }
	    return false;
    }
}
