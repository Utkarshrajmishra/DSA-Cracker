class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node n=node;
       while(ind-- >=0)
       {
           if(ind==0)
           {
               return n.data;
               
           }
           n=n.next;
         
       }
         return -1;
    }
}
