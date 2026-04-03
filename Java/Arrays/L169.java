package Java.Arrays;

public class L169 {
    // Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    public static void main(String[] args) {
        int []arr = {1,2,3,2};
        System.out.println(majorityElement(arr));
        
    }

    static int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for (int num : nums) {
            if (count == 0) {
                majority = num;
            }

            count += (num == majority) ? 1 : -1;
        }

        return majority;
        
    }
    
}
