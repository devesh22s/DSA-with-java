package Java.BinarySearch;

public class searching {
    public static void main(String[] args) {
        int [] arr = {-12, -2,-1,0,3,4,6,7,8,23,56,77};
        int target = 23;
        System.out.println(binarySearch(arr, target));  
        
    }
    static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length -1;

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
