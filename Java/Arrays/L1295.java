package Java.Arrays;

// Find Numbers with Even Number of Digits
public class L1295 {
    // Given an array nums of integers, return how many of them contain an even number of digits.

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,66};
        // System.out.println(findNumbers(nums));
        // System.out.println(digits(12344));
        System.out.println(findNumbers2(nums));
    }


    // method -1 
    static int findNumbers(int[] nums){
        int count =0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check for even number
    static boolean even(int num){
        int numberOfDigits = digits(num);
        // if (numberOfDigits %2 == 0) {
        //     return true;      
        // }
        // return false;
        return numberOfDigits %2 == 0;
    }
    // count number of digit in a number
    static int digits(int num){
        if(num <0){
            num = num*-1;
        }
        // if(num ==0){
        //     return 1;
        // }
        // int count =0;
        // while (num>0) {
        //     count++;
        //     num = num/10;    
        // }
        // return count;

        return (int)(Math.log10(num))+1;     //optimised method
    }



    
    // method -2 
     static int findNumbers2(int[] nums) {
      int count = 0;

        for(int num : nums) {
            int digits = 0;
            int n = num;

            while(n > 0) {
                n = n / 10;
                digits++;
            }

            if(digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    

}
