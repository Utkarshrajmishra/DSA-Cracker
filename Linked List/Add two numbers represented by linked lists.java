class Solution{
    //Function to add two numbers represented by linked list.
   public static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node prev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return prev;   
        
    }
    static Node addTwoLists(Node first, Node second){
        first = reverse(first);
        second = reverse(second);
        Node dummy = new Node(0);
        Node res = dummy;
        int carry = 0;
        while(first!=null || second!=null || carry!=0){
            int msum = 0;
            if(first!=null){
                msum+=first.data;
                first = first.next;
            }
            if(second!=null){
                msum+=second.data;
                second = second.next;
            }
            msum+=carry;
            carry = msum/10;
            
            res.next = new Node(msum%10);
            res = res.next;
        }
        return reverse(dummy.next);
    }
}
