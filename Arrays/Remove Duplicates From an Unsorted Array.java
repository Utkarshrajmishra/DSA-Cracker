import java.util.*;

public class removeduplicate {
    public static void main(String[] args) {

        int n = 9;
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        remove(arr,arr.length);
    }
    static void remove(int arr[], int size)
    {
        HashSet <Integer> map=new HashSet<>();
        for(int i=0;i<size;i++)
        {
            if(!map.contains(arr[i]))
            {
                map.add(arr[i]);
                System.out.println(arr[i]+" ");
            }
        }
    }
}
