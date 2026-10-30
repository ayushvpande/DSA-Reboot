class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length / 3;
        Map<Integer, Integer> frequency = new TreeMap<>();
        List<Integer> answer = new ArrayList<>();
 
        // Store the final frequency of every distinct value.
        for (int value : nums) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }
 
        // Inspect each distinct value directly in ascending key order.
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            // Store the value when its final frequency crosses the threshold.
            if (entry.getValue() > threshold) {
                answer.add(entry.getKey());
            }
 
            // At most two distinct values can satisfy the condition.
            if (answer.size() == 2) {
                break;
            }
        }
 
        return answer;
    }

        
    
}
