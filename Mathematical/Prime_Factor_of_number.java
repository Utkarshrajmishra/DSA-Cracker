package Maths;

public class Prime_Factor_of_number {
    public static void main(String[] args) {
        int n = 315;
        primeFactors(n);
    }

    private static void primeFactors(int n) {
        int c=2;
        while(n>1)
        {
            if(n%c==0)
            {
                System.out.println(c+" ");
                n/=c;
            }
            else
            {
                c++;
            }
        }
    }
}
