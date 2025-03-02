public class sortinsertion {
    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 1, 7, 3, 4, 2};
        
        for (int i = 1; i < arr.length; i++) { 
            int cur = arr[i]; // Store current element
            int pre = i - 1;

            // Shift elements to the right if they are greater than key
            while (pre >= 0 && arr[pre] > cur) {
                arr[pre + 1] = arr[pre]; 
                pre--;
            }

            // Insert the key in its correct position
           // arr[pre + 1] = cur;  
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






