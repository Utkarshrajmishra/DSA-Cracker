package Maths;

public class Smith_Number {
    public static void main(String[] args) {
        int a=4;
        check(a);
    }

    private static void check(int a) {
        int n=a;
        int sum=0;
        int c=1;
        while(n>0)
            {
                if(n%c==0)
                {
                    sum+=c;
                    n/=c;
                }
                else
                {
                    c++;
                }

        }
        if(a==sum)
        {
            System.out.println("Smith Number");
        }
        else
        {
            System.out.println("Not a smith number");
        }
    }
}
