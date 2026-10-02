import java.util.HashMap;
import java.util.Map;

public class SolutionA4 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        // Base case: prefix sum of 0 appears once before any elements are processed
        prefixSumCounts.put(0, 1);

        int currentSum = 0;
        int totalSubarrays = 0;

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) has occurred before, add its frequency
            if (prefixSumCounts.containsKey(currentSum - k)) {
                totalSubarrays += prefixSumCounts.get(currentSum - k);
            }

            // Record current prefix sum frequency
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }

        return totalSubarrays;
    }
}