package Java.BinarySearch;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        // System.out.println("the pivot is = "+findPivot(arr));

        int [] arr2 = {2,9,2,2,2};
        System.out.println("the pivot is = " + findPivotWithDuplicates(arr2));
        
    }

    //  this will not work for duplicate multiples values 
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            //  4 cases here
            if( mid < end && arr[mid] > arr[mid +1]){
                return arr[mid];
            }
            if(mid > start && arr[mid-1] > arr[mid]){
                return arr[mid-1];
            }
            if(arr[start] >=  arr[mid]){
                end = mid-1;
            }else {
               start = mid+1;
            }

        }
        return  -1;

    }
    

    //  if the array has the multiple values
    static int findPivotWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            //  4 cases here
            if( mid < end && arr[mid] > arr[mid +1]){
                return arr[mid];
            }
            if(mid > start && arr[mid-1] > arr[mid]){
                return arr[mid-1];
            }
            
            // if elements at mid, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if the elements at start and end were the pivots:
                // check if the start is pivot;

                if(arr[start] >arr[start+1]){
                    return start;
                }
                start++;

                //  check if the end is pivot
                if(arr[end]< arr[end-1]){
                    return end-1;
                }
                end--;

            }
            // left side is sorted, so pivot be in right side
            else if(arr[start] <arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start =mid +1;
            }else{
                end = mid-1;
            }


        }
        return  -1;

    }
    
    
}
