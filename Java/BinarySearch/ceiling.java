package Java.BinarySearch;

// Ceiling = array में वह smallest element जो target से बड़ा या equal हो।
public class ceiling {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 10;
        System.out.println(ceiling_method(arr, target));        
    }
   // return the index: smallest number >= target
    static int ceiling_method(int [] arr, int target){
        // but if the target element is greater then the greatest element in the array
        if(target> arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target <arr[mid]) {
                end = mid-1; 
            } else if(target >arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }  
        }
        return arr[start];

    }
    
}




// Binary SearchPattern
// Pattern	    Condition
// Floor	        <=
// Ceiling	        >=
// Upper Bound	    >
// Lower Bound	    >=