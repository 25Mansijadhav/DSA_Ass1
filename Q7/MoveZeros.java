public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0; // Pointer to keep track of the position of the next nonzero element

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is nonzero, move it to the position pointed by j
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
