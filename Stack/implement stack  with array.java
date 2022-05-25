public class implement_with_array {
    static int arr[];
    static int top;
    static int capacity;
    
    implement_with_array(int size)
    {

        arr =new int[size];
        top=-1;
        capacity=size;
    }

    public static void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is already full");
            return;
        }
        ++top;
        arr[top]=data;
    }

    public static Boolean isFull()
    {
        return top+1==capacity;
    }

    public static void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is already empty");
            return;
        }
        top--;
    }

    public static Boolean isEmpty()
    {
        return top==-1;
    }

    public static void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Peek :"+ arr[top]);
    }

    public static void  print()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String args[])
    {
        implement_with_array stack=new implement_with_array(5);
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(5);
        push(8);

        pop();

        print();
        peek();
    }
}
