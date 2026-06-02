package Java.Recursion;

public class basic {
    public static void main(String[] args) {
        // print(1);

        // int result = fibo(6);   // here 6 is the index where fibonnachi is number is 8
        // System.out.println(result);


        int []arr = {1,2,4,5,6,55,66,77};
        int target = 6;
        System.out.println(binary_sear(arr, target, 0, arr.length-1));


    }


    // static void print(int a){
    //     if(a==5){   // this is the base condition for recursion
    //         System.out.println(a);
    //         return;
    //     }
    //     System.out.println(a);
    //      recursive call -->
    //     // if you are calling a function again and again, you can treat it as a seperate call in the stack
    //     print(a +1);   
    // // this is last function call
    //    so this is called tail recursion
    // }


    // fibonnachi series
    static int fibo(int n){

        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) +fibo(n-2);
    }



    //  RECURSION IN BINARY SEARCH

    static int binary_sear(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;   // we not pass mid int the argument because in last the mid will be s or e one of them

        if(arr[m]== target){
            return m;
        }
        if(target<arr[m]){
            return binary_sear(arr, target, s, m-1);
        }
        return binary_sear(arr, target, m+1, e);

    }
}
