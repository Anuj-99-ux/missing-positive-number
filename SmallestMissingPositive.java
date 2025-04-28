import java.util.HashSet;

public class SmallestMissingPositive {
    
    public static int findSmallestMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all positive numbers to the HashSet
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        // Start from 1 and find the first missing positive
        int smallestMissingPositive = 1;
        while (set.contains(smallestMissingPositive)) {
            smallestMissingPositive++;
        }
        
        return smallestMissingPositive;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};  // Example input
        int result = findSmallestMissingPositive(nums);
        System.out.println("Smallest missing positive number: " + result);
    }
}
