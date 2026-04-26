package Java.BinarySearch_2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
        
    }
    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd -cStart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
                
            }
            if(matrix[mid][row] <target){
                cStart = mid +1;
            }else{
                cEnd = mid-1;
            }
            
        }
        return new int[]{-1,-1};
    }
    

    static int[] search(int[][]matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;   //be caution, matrix may be empty

        // if only there are two rows
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, col-1, target);  
        }

        //eleminating rows process
        int rStart =0;
        int rEnd = rows-1;
        int cmid = col/2;

        // run the loop till 2 loops are remaining
        while (rStart < (rEnd-1)) {  // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd -rStart) /2;
            if (matrix[mid][cmid] == target) {
                return new int[] {mid,cmid};
                
            }
            if(matrix[mid][cmid]< target){
                rStart =mid;
            }else{
                rEnd = mid;
            }

            
        }

        //  now we have two rows 
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cmid]== target) {
            return new int[]{rStart, cmid};
            
        }
        // search in first half
        if (matrix[rStart][cmid-1] >= target) {
            return binarySearch(matrix, rStart, 0, cmid-1, target);   
        }
        // search in second half
        if (matrix[rStart][cmid+1] <= target && target <= matrix[rStart][col-1]) {
            return binarySearch(matrix, rStart, cmid+1, col-1, target);   
        } 
        // search in third half
        if (matrix[rStart+1][cmid-1] >= target) {
            return binarySearch(matrix, rStart+1, 0, cmid-1 ,target );
        } // search in fourth half
        else{
            return binarySearch(matrix, rStart+1, cmid+1, col-1 ,target );
        }


    }
}
