package Maths;

public class LCM_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,4,8};
       System.out.println(LcmOfArray(arr,0));
    }
    static int __gcd(int a, int b)
    {
        return b == 0? a:__gcd(b, a % b);
    }


    static int LcmOfArray(int[] arr, int idx)
    {


        if (idx == arr.length - 1){
            return arr[idx];
        }
        int a = arr[idx];
        int b = LcmOfArray(arr, idx+1);
        return (a*b/__gcd(a,b)); //
    }

}
