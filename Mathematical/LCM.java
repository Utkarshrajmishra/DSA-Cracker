package Maths;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println((a*b)/gcd(a,b));
    }

    private static int gcd(int a, int b) {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}


