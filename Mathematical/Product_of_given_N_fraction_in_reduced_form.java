package Maths;

public class Product_of_given_N_fraction_in_reduced_form {
    public static void main(String[] args) {
        int n = 3;
        int num[] = { 1, 2, 5 };
        int den[] = { 2, 1, 6 };
        reduced(n,num,den);
    }
    public static void reduced(int n, int num[], int den[])
    {
        int sum=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            sum*=num[i];
            sum2*=den[i];

        }
        int a=gcd(sum,sum2);
        System.out.println("Num"+sum/a);
        System.out.println("Deno"+sum2/a);
    }


    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}
