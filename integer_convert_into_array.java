public class integer_convert_into_array {
    public static void main(String[] args) {
        int number = 12345; // Example integer
        int temp = number;
        int length = 0;

        // Find the length of the number
        while (temp > 0) {
            length++;
            temp /= 10;
        }

        // Create an integer array to store digits
        int[] digitsArray = new int[length];

        // Extract digits and store them in the array
        for (int i = length - 1; i >= 0; i--) {
            digitsArray[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Output the resulting array
        System.out.print("Integer Array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
    }
}
