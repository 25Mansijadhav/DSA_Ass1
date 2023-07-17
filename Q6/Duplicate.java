import java.util.HashSet;

public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }
            set.add(num);
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println(hasDuplicates);
    }
}
