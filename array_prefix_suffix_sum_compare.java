public class array_prefix_suffix_sum_compare {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        // prefix sum
        for (int i = 1; i < arr.length; i++) {
            sum = arr[i] + arr[i - 1]; }
        System.out.println("prefix sum:" + sum);

        int sum2 = 0;
        for (int j = arr.length; j > 0; j--) {
            sum2 = sum2 + arr[j - 1]; }
       
            System.out.println("suffix sum:" + sum2);
          if (sum == sum2) {
            System.out.println("sum is equal");

        } else {
            System.out.println("sum is not eqaul");
        }System.out.print("end");
    }

}

//prefix and suffix sum compare










