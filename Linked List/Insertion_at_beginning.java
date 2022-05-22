public class Insertion_at_beginning {
    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void push(int d) {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    public static void atstart(int d) {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    public static void print(Node head) {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        atstart(8);

        print(head);
    }
}
