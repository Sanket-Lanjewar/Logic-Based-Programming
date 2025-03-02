
import java.util.Scanner;

 public class array_to_number_convert  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number as an array of digits
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] digitsArray = new int[size];
        
        System.out.println("Enter the digits of the number: ");
        for (int i = 0; i < size; i++) {
            digitsArray[i] = scanner.nextInt();
        }
        
        // Convert the array of digits to a number
        int number = 0;
        for (int i = 0; i < digitsArray.length; i++) {
            number = number * 10 + digitsArray[i]; // Shift left and add the digit
        }
        
        // Output the number
        System.out.println("The number formed from the array is: " + number);
    }
}










