package Java.BinarySearch;
// Peak Index in a Mountain Array
public class L852 {   // same answer for leetcode 162 question
    // You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
    // Return the index of the peak element.
    // Your task is to solve it in O(log(n)) time complexity.

    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6,7,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));  
    }
     static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length -1;    
        while(start < end){
            int mid  = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are decreasing part of an array
                // this may be answer but look at left
                // this is why end != mid-1 
                end = mid;
            }
            else{
                // you are in acs order of an array
                start = mid+1;
            }   
        }
        // in the end, start ===end and pointing to the largest number because of 2 checks above 3
        // start and end are always trying to find max elements in the above 2 checks 
        // hence, when they are pointing to just one element, that is maximum one because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining , hence because of above line that is the best possible answer.
        return start; // aur return end as both are equal

    }
    
}
