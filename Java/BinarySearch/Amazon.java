package Java.BinarySearch;
//  Find position of an element in a sorted array of infinite numbers.   -- for this type of questions divide into chunks
public class Amazon {
    public static void main(String[] args) {
        int []arr  = {2,3,4,5,6,7,8,9,11,22,34,56,67,121,123,143,145,166,167,1123,1145};
        int target = 11;
        System.out.println(ans(arr, target));  
    }

    static int ans(int []arr, int target){
        // first find the range
        // first start with box of size 2
        int start =0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end+1;  // this is my new start
            // double the box value 
            // end = previous end + sizeofbox *2
            end = end+ (end-start +1)*2;  // we add 1 here because for the index of array, to shift forward as index start from 0
            start = temp;
            
        }
        return infiniteSearch(arr, target, start, end);
    }
    static int infiniteSearch(int [] arr, int target, int start, int end){
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
    
}
