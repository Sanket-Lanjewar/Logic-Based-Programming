public class string_to_stringArray 
 {
    public static void main(String[] args) {
        // Input string
        String input = "apple,banana,cherry,orange";

        // Split the string by commas
        String[] fruitsArray = input.split(", ");

        // Output the resulting array
        System.out.print("Array of fruits: ");
        for (String fruit : fruitsArray) {
            System.out.print(fruit + " ");
        }
    }
}






