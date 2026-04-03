package Java.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        String name = "Devesh";
        char target = 'v';
        int [] arr ={2,3,4,5,6,1};
        int target2 = 5;
        // System.out.println(search2(name, target));
        // System.out.println(search3(arr, target2, 1, 3));
        // System.out.println(min(arr));

        int [][] dimArr = {
            {1,2,3,66,34},
            {4,5,6},
            {7,8,9,3},
            {22,15}
        };
        int dimtarget = 9;
        int []result = dimsearch(dimArr, dimtarget);
        // System.out.println(Arrays.toString(result));
        System.out.println(max(dimArr));


      
    }


    // -------------------------------------------------------------------------------------------
    // in string array
    static boolean search2(String str, char target){
        if(str.length() ==0){
            return false;
        }

        for(char ch: str.toCharArray()){   // basically for each work on array so we convert string into character array
            if(ch == target){
                return true;
            }
        }
        return false;
    }

// ----------------------------------------------------------------------------------------------------
    // search target in particular range
     static int search3(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){  
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }


// -----------------------------------------------------------------------------------------------------
    //  find minimum number
    static int min(int[] arr){
        int min = arr[0];
        for(int i =1; i< arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                
            }
        }
        return min;

    }

// -----------------------------------------------------------------------------------------------------
    //  search in 2d array

    static int[] dimsearch(int[][] arr, int target){
        for (int row =0; row < arr.length; row++) {
            for (int col= 0; col< arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
                
            }
            
        }
        return new int[]{-1, -1};

    }
    


    // -----------------------------------------------------------------------------------
    // find maximum number in 2d array
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int [] ints : arr ) {
            for (int element: ints) {
                if(element> max){
                    max = element; // arr[row][col];
                }               
            }           
        }
        return max;
    } 




    
}
