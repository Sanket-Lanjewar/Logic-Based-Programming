public class TargetSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j =  1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }
}
 






