import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate through the digits in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by one
            digits[i]++;

            // Check if there is a carry
            if (digits[i] < 10) {
                // No carry, return the digits as is
                return digits;
            }

            // Carry over to the next digit
            digits[i] = 0;
        }

        // If we reach this point, it means there is a carry at the most significant digit
        // Create a new array with one additional digit for the carry
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };

        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
