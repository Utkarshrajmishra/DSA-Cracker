class HelloWorld {
    public static void main(String[] args) {
        int n=14;
        fact(n);
    }
    public static void fact(int n)
    {
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                 if (n/i == i)
                        System.out.print(" "+ i+" ");
                 else
                 System.out.print(n/i+" ");
            }
        }
    }
}
