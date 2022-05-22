class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        Node temp=head;
        int counter=0;
        while(temp!=null)
        {
            if(temp.data==search_for)
            {
                counter++;
            }
            temp=temp.next;
        }
        return counter;
    }
}
