import java.util.*;
 
public class tuf {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The smallest element in the array is: "+SmallestElement(arr1));
 
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The smallest element in the array is: "+SmallestElement(arr2));
  }
  static int SmallestElement(int arr[]) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
}
