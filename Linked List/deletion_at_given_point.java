public class deletion_at_given_point {
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

    public static void push(int d)
    {
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
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

    public static Node delete(Node head, int positon)
    {
      while(positon-->1)
      {
          if(positon==2)
          {
              head.next=head.next.next;
          }
          head=head.next;
      }
      return head;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        head=delete(head, 2);
        print(head);
    }
}
