class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
       LinkedHashSet<Integer> h =new LinkedHashSet<>();
       int i;
       Node p,q;
       p=head1;
       q=head2;
       while(q!=null)
       {
           h.add(q.data);
           q=q.next;
       }
       Node dummy=new Node(-1);
       Node temp=dummy;
       while(p!=null)
       {
           if(h.contains(p.data)==true){
               Node n=new Node(p.data);
              temp.next=n;
              temp=n;
              h.remove(p.data);
           }
           p=p.next;
       }
       return dummy.next;
   }
}
