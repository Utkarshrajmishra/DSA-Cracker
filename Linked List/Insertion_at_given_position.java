public class Insertion_at_given_position {
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
    public static void push(int position, int data, Node head)
    {
        if(position<1)
        {
            return;
        }
        else if(position==1)
        {
            Node new_node=new Node(data);
            new_node.next=head;
            head=new_node;
        }
        else{
            while(position-->0)
            {
                if(position == 1)
                {
                    Node new_node=new Node(data);
                    new_node.next=head.next;
                    head.next=new_node;
                }
                head=head.next;
            }
        }

    }

    public static void print(Node head)
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+ " ");
            n=n.next;
        }
    }

    public static void pushstart(int data)
    {
       Insertion_at_given_position.Node new_node=new Insertion_at_given_position.Node(data);
        new_node.next=head;
        head=new_node;

    }
    public static void main(String[] args) {
        pushstart(1);
        pushstart(2);
        pushstart(3);
        push(2,4,head);
        print(head);

    }
}
