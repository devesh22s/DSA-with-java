package Java.BinarySearch;
// Search in Rotated Sorted Array

public class L33 {

    // There is an integer array nums sorted in ascending order (with distinct values).
    // Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
    // Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
    // You must write an algorithm with O(log n) runtime complexity.

    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(arr, target));
        // System.out.println(binarySearch(arr, target, 0, arr.length-1));
        
    }
    static int search(int nums[], int target){

        int pivot = findPivot(nums);
        //  if you did not find the pivot then , it means that the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is found, you have found 2 asc arrys
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);

        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
        

    }
    static int binarySearch(int [] arr, int target, int start, int end){
      

        while (start <= end) {
            // find mid element
            // int mid = (start +end)/2;    // it might be possible when we add start+ end then it may exceed the range of the int datatype
            int mid = start + (end-start)/2;

            if (target <arr[mid]) {
                end = mid-1; 
            } else if(target >arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }  
        }
        return -1;

    }

    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            //  4 cases here
            if( mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid-1] > arr[mid]){
                return mid-1;
            }
            if(arr[start] >=  arr[mid]){
                end = mid-1;
            }else {
               start = mid+1;
            }

        }
        return  -1;

    }
    
    
}
