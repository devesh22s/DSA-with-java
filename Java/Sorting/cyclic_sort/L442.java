package Java.Sorting.cyclic_sort;
// Find All Duplicates in an Array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L442 {
    // Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
    // You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
    public static void main(String[] args) {
          int[] arr = {4,3,2,7,8,2,3,1};

        L442 obj = new L442();

        List<Integer> ans = obj.findDuplicates(arr);

        System.out.println("The duplicates elements are -> "+ans);
        System.out.println(Arrays.toString(arr));
        
    }
     public List<Integer> findDuplicates(int[] nums) {
        int i =0;
        while(i< nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        // just find missing numbers
        List <Integer> ans = new ArrayList<>();
        for(int index =0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;

    }
    

    static void swap(int []nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    

        
    
    
}
