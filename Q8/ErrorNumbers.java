import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ErrorNumbers {
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int duplicate = 0;
        int missing = 0;

        for (int num : nums) {
            if (numSet.contains(num)) {
                duplicate = num;
            }
            numSet.add(num);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
