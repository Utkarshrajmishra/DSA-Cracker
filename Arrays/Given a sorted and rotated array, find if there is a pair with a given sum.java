import java.util.HashSet;

public class gievn_sum {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 16;
        System.out.println(sum(arr, sum));
    }

    private static int sum(int[] arr, int sum) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(sum - arr[i])) {
                count++;
            }
            set.add(arr[i]);
        }
        return count;
    }
}
