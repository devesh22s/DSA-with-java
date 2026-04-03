package Java.Arrays;

//  Richest Customer Wealth
public class L1672 {
    // You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public static void main(String[] args) {
    int [][]accounts = {{1,2,3,1},{3,2,1}};
    System.out.println(maximumWealth(accounts));
    
}
static int maximumWealth(int[][] accounts){
    int maxSum =Integer.MIN_VALUE;
        for(int[] rows: accounts){
            int sum =0;
            for(int col :rows){
                sum = sum+col;

            }
            if(sum >maxSum){
                maxSum = sum;
            }
        }
       return maxSum; 
}
    
}
