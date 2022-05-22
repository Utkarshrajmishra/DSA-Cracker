public class deletion_at_beginning {
    public static Node head;
    public static class Node
    {
        Node next;
        int data;
     Node (int d)
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

    public static void print(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static Node delete(Node head)
    {

        head=head.next;
        return head;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        head=delete(head);
        print(head);

    }


}
