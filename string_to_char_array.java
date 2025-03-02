
public class string_to_char_array  {
    public static void main(String[] args) {
        // Input string
        String input = "hello";

        // Convert the string into a character array
        char[] charArray = input.toCharArray();

        // Output the resulting character array
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}



