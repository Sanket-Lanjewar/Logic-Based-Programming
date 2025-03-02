public class array_convertinto_integer {
    public static void main(String[] args) {
        int[] digitsArray = {1, 2, 3, 4, 5}; // Example integer array
        int number = 0;

        // Combine elements into a single integer
        for (int digit : digitsArray) {
            number = number * 10 + digit;
        }

        // Output the resulting number
        System.out.println("The combined number is: " + number);
    }
}













