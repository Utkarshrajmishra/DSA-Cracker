/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
          
      if (head.next==null)
		    return head;
	    head.next = compute(head.next);
	    return head.data < head.next.data ? head.next : head;
   
    }
}
