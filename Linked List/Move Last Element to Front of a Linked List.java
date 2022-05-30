class Solution {
    public static Node moveToFront(Node head) {
        // code here
          if(head == null || head.next == null)
              return head;
        Node n=head;
        Node curr=null;
        while(n.next!=null)
        {
            curr=n;
            n=n.next;
        }
        
        curr.next=null;
        n.next=head;
        head=n;
        return head;
        
    }
}
        
