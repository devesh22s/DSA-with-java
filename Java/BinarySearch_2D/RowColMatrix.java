package Java.BinarySearch_2D;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3,4},
            {11,12,13,14},
            {21,22,23,24},
            {31,32,33,34}
        };
        System.out.println(Arrays.toString(search(arr, 24)));
        
    }

    static int [] search(int[][] matrix, int target){
        int row =0;
        int col = matrix.length -1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }
            if(matrix[row][col] <target){
                row++;
            }else{
                col--;
            }

        }
        return new int[]{-1,-1};
    }
    
    
}
