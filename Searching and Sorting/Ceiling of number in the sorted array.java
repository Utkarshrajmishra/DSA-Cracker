import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int arr[]={1,3,5,7,8,10};
        int k=2;
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]<k && arr[mid+1]>k)
            {
                System.out.println(arr[mid+1]);
                break;
            }
            else if(arr[mid]==k)
            {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>k)
            {
                end=mid;
            }
            else
            {
             start=mid+1;
            }
        }
    }
}
