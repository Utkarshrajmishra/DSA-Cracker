class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        Node n=head;
        int counter=0;
        while(n!=null)
        {
            n=n.next;
            counter++;
        }
        return counter;
    }
}
