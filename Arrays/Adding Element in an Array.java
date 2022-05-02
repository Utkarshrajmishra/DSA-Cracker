import java.util.HashSet;
public class repeated {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        findRepeatingElements(arr);
    }

    private static void findRepeatingElements(int[] arr) {
        HashSet<Integer> ll=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(ll.contains(arr[i]))
            {
                System.out.print(arr[i]+" ");
            }
            ll.add(arr[i]);
        }
    }
}
