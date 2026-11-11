import java.util.HashSet;
import java.util.Set;

class Solution {
    // Returns the length of the longest consecutive sequence.
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();

        // Store every value once so membership checks ignore duplicates.
        for (int value : nums) {
            values.add(value);
        }

        int longestLength = 0;

        // Examine every distinct value as a possible sequence start.
        for (int value : values) {
            // A present predecessor means this value lies inside a sequence.
            if (values.contains(value - 1)) {
                continue;
            }

            int currentLength = 1;
            int nextValue = value + 1;

            // Extend the sequence while each next consecutive value exists.
            while (values.contains(nextValue)) {
                currentLength++;
                nextValue++;
            }

            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 2, 5};

        // instance for class Solution
        Solution sol = new Solution();

        System.out.println(sol.longestConsecutive(nums));
    }
}
