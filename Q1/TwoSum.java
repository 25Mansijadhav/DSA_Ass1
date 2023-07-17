import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number along with its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is present in the HashMap
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { complementMap.get(complement), i };
            }

            // Add the current number and its index to the HashMap
            complementMap.put(nums[i], i);
        }

        // No solution found, return an empty array or handle the case as desired
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("[" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
