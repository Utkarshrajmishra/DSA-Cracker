class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node temp=head;
         int counter=0;
         while(temp!=null)
         {
             temp=temp.next;
             counter++;
         }
         counter/=2;
         temp=head;
         while(counter>0)
         {
             counter--;
             temp=temp.next;
         }
         return temp.data;
    }

    
}
