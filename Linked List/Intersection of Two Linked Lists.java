class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        Node p,q;
       p=head1;
       q=head2;
       LinkedHashSet<Integer> h =new LinkedHashSet<>();
       while(q!=null)
       {
           h.add(q.data);
           q=q.next;
       }
       Node dummy=new Node(-1);
       Node temp=dummy;
       while(p!=null)
       {
           if(h.contains(p.data)==true)
           {
               Node n=new Node(p.data);
               temp.next=n;
               temp=n;
           }
           p=p.next;
       }
       return dummy.next;
    }
}
