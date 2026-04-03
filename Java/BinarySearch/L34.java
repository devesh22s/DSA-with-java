package Java.BinarySearch;
//  Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class L34 {
    // Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
    public static void main(String[] args) {
        int [] arr = {0,3,4,4,4,4,6,7,8,23,56,77};
        int target = 4;
        System.out.println(Arrays.toString(searchRange(arr, target)));  
        
    }
    static int[] searchRange(int [] nums, int target){
        int [] ans = {-1, -1};
        // check for the first occurance of the target 
        ans[0] = search(nums, target, true);  // first occurrence
        if(ans[0] != -1){

            ans[1] = search(nums, target, false);  // last occurrence
        }

        

        return ans;


    }

    // this function just returns the index value of the target 
    static int search(int[]nums, int target, boolean findStartIndex){
        int ans = -1;
        int start =0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target <nums[mid]) {
                end = mid-1; 
            } else if(target >nums[mid]){
                start = mid+1;
            }else{
                // potential answer is found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;

                }else{
                    start = mid+1;
                }
            }  
        }
        return ans;

    }
}
