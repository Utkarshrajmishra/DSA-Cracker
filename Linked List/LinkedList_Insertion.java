public class LinkedList_Insertion {
   public static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            d = data;
            next = null;
        }

    }

    public static void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }


    public static void main(String[] args) {
            LinkedList_Insertion ll=new LinkedList_Insertion();

            ll.head=new Node(1);
            Node second=new Node(2);
            Node third=new Node(3);

            ll.head.next=second;
            second.next=third;


            print();

        }


}
