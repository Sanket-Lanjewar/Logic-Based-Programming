import java.util.Arrays;

public class arraysort_minmax {
    public static void main(String[] args) {
        int[] arr = { 43, 4, 3, 5, 3, 5 };
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println(min);
        System.out.println(max);
        int maxs = arr[arr.length - 2];
        System.out.println("second max element:" + maxs);

    }
}






