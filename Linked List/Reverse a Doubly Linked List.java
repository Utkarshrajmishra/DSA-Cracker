public static Node reverseDLL(Node  head)
{
    //Your code here
    Node cur=head;
   Node k=null;
   while(cur!=null)
   {
       Node g=cur.next;
       
      
       cur.prev=cur.next;
       cur.next=k;
        k=cur;
       cur=g;
   }
   return k;
}
