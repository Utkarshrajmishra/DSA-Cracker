import java.util.HashSet;

public class detect_loop_in_linkedlist {
    public static Node head;
    public static class Node{
        int data;
        Node next;
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

    public static boolean loop(Node head)
    {
        HashSet <Integer> set=new HashSet<>();
        Node n=head;
        while(n!=null)
        {
            if(set.contains(n.data))
            {
                return true;
            }
            n=n.next;
        }
        return false;
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        boolean flag=loop(head);
        System.out.println(flag);

    }

}
