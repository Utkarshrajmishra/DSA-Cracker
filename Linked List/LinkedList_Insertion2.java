public class LinkedList_Insertion2 {
   public static Node head;
    public static class Node{
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public static void print(Node head)
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void push(int data)
    {
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;

    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        print(head);
    }
}
