public class search_node {
    public static Node head;
    public static class Node
    {
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

     public static boolean search(int data, Node head)
     {
         Node n=head;
         while(n!=null)
         {
             if(n.data==data)
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
        System.out.println(search(1,  head));
    }
}
