package Java.BinarySearch;

public class floor {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floor_method(arr, target));  
        
    }
    // return the index: greatest number <= target
    static int floor_method(int [] arr, int target){
        // 
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
        return end;

    }
    


    
}
