package Maths;

public class GCD_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,4,8};
        System.out.println(cal(arr));
    }
    public static int cal(int arr[])
    {
        int result=arr[0];
        for(int i:arr) {
            result = gcd(result, i);

            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    public static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(a%b,b);
    }
}
