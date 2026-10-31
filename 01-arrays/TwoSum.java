class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // A pair requires two different indices.
        if (n < 2) {
            return new int[0];
        }

        Map<Long, Integer> valueToIndex = new HashMap<>();

        for (int current = 0; current < n; current++) {
            long req =
                (long) target - nums[current];

            /*
             * Check before insertion so the current
             * index cannot be paired with itself.
             */
            if (valueToIndex.containsKey(req)) {
                return new int[]{
                    valueToIndex.get(req),
                    current
                };
            }

            // Save this value for elements that appear later.
            valueToIndex.put((long) nums[current], current);
        }

        // No valid pair exists.
        return new int[0];
    }
}

