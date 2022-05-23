class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
   int l1 = len(head1);
      int l2 = len(head2);
      
      
      int diff = Math.abs(l1-l2);
      
      if(l1>l2){
          for(int i=0;i<diff;i++){
              head1 = head1.next;
          }
      }
      if(l2>l1){
          for(int i=0;i<diff;i++){
              head2 = head2.next;
          }
      }
      
      while(head1!=null && head2!=null){
          if(head1 == head2){
              return head1.data;
            
          }
          head1 = head1.next;
          head2 = head2.next;
      }
      return -1;
         
	}
	
	public int len(Node node){
	    int len=0;
	    while(node!=null){
	        len++;
	        node = node.next;
	    }
	    return len;
	}
	
	
	
	
}

