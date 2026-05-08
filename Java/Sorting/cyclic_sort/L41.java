package Java.Sorting.cyclic_sort;
//  First Missing Positive

public class L41 {
// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
     public static void main(String[] args) {
        int [] arr = {1,2,0};
        int ans = sort(arr);
        System.out.println(ans);
        
    }
     static int sort(int [] arr){
        int i =0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }

        }

        // search for first missing number
        // case 1
        for(int index=0; index <arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }

        // case 2
        return arr.length+1;

    }

    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
