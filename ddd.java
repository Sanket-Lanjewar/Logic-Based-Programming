import java.util.*;
class Solution {

    public static void sumOfOddBellNumbers(int lowerNumber, int upperNumber) {
        // Validate constraints
        if (lowerNumber < 1 || upperNumber < 1 || lowerNumber > upperNumber) {
            System.out.println("ge");
            return;
        }

        // Generate Bell numbers until we exceed the upperNumber
        List<Integer> bellNumbers = generateBellNumbers(upperNumber);
        int sum = 0;

        // Calculate sum of odd Bell numbers within the given range
        for (int bellNum : bellNumbers) {
            if (bellNum >= lowerNumber && bellNum <= upperNumber && bellNum % 2 != 0) {
                sum += bellNum;
            }
        }

        // Output the sum
        System.out.println(sum);
    }

    // Function to generate Bell numbers using Bell Triangle
    private static List<Integer> generateBellNumbers(int upperLimit) {
        List<Integer> bellNumbers = new ArrayList<>();
        int[][] bellTriangle = new int[100][100]; // Assuming we won't need more than 100 rows

        // Initialize the first Bell number
        bellTriangle[0][0] = 1;
        bellNumbers.add(1);

        for (int i = 1; i < 100; i++) {
            bellTriangle[i][0] = bellTriangle[i - 1][i - 1]; // Start of the row is the last element of the previous row
            if (bellTriangle[i][0] > upperLimit) break;
            bellNumbers.add(bellTriangle[i][0]);

            // Fill the rest of the row using Bell's triangle formula
            for (int j = 1; j <= i && j < 100; j++) {
                bellTriangle[i][j] = bellTriangle[i - 1][j - 1] + bellTriangle[i][j - 1];
                if (bellTriangle[i][j] > upperLimit) break;
            }
        }

        return bellNumbers;
    }

    public static void main(String[] args) {
        sumOfOddBellNumbers(10, 10000); // Example usage
    }
}
