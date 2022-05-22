class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Stack <Integer> s=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            s.push(temp.data);
            temp=temp.next;
        }
        boolean flag=true;
        while(head!=null)
        {
            int i=s.pop();
            if(head.data==i)
            {
                flag= true;
            }
            else
            {
                flag= false;
                break;
            }
            head=head.next;
        }
        return flag;
        
    }    
}

