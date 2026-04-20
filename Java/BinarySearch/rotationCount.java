package Java.BinarySearch;

public class rotationCount {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));

        
        
    }
    public  static int countRotations(int arr[]){
        int pivot = findPivot(arr);
        return pivot +1;

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




