package Java.BinarySearch;

public class L410 {
    
    // Core logic function
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        
        for (int num : nums) {
            left = Math.max(left, num); // Range starts from the largest single element
            right += num;               // Range ends at the total sum of the array
        }
        
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if we can split the array into 'k' subarrays with sum <= mid
            if (canSplit(nums, k, mid)) {
                ans = mid;     
                right = mid - 1; // Try to find a smaller "max sum"
            } else {
                left = mid + 1;  // Need to increase the allowed max sum
            }
        }
        return ans;
    }
    
    // Helper function to validate the mid value
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int currentSum = 0;
        int subarrays = 1; 
        
        for (int num : nums) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                subarrays++;
                currentSum = num;
                // Agar subarrays count k se zyada ho jaye, toh ye mid valid nahi hai
                if (subarrays > k) return false;
            }
        }
        return true;
    }

    // Main function to test the code
    public static void main(String[] args) {
        L410 solver = new L410();

        // Example 1
        int[] nums1 = {7, 2, 5, 10, 8};
        int k1 = 2;
        System.out.println("Test Case 1 Output: " + solver.splitArray(nums1, k1)); // Expected: 18

        // Example 2
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("Test Case 2 Output: " + solver.splitArray(nums2, k2)); // Expected: 9
        
        // Example 3 (Edge case: k = array length)
        int[] nums3 = {1, 4, 4};
        int k3 = 3;
        System.out.println("Test Case 3 Output: " + solver.splitArray(nums3, k3)); // Expected: 4
    }
}