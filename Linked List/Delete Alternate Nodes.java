/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        Node n=head;
        if(n==null)
        {
            return;
        }
        while(n!=null)
        {
            if(n==null || n.next==null)
            {
                return ;
            }
            n.next=n.next.next;
            n=n.next;
        }
    }
}
