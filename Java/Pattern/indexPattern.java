public class indexPattern {
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        
    }



// 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 3 4 3 2 1 0 
// 0 1 2 3 3 3 2 1 0 
// 0 1 2 2 2 2 2 1 0 
// 0 1 1 1 1 1 1 1 0 
// 0 0 0 0 0 0 0 0 0 
    static void pattern1(int n) {
        n = 2*n;
        for(int row=0; row<=n; row++){
            for(int col= 0; col<=n; col++){
                int atEveryIndex = Math.min(Math.min(col,row), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
        
    }



// 4 4 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 3 3 4 
// 4 3 2 2 2 2 2 3 4 
// 4 3 2 1 1 1 2 3 4 
// 4 3 2 1 0 1 2 3 4 
// 4 3 2 1 1 1 2 3 4 
// 4 3 2 2 2 2 2 3 4 
// 4 3 3 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 4 4 
    static void pattern2(int n) {
        int originalN = n;
        n = 2*n;
        for(int row=0; row<=n; row++){
            for(int col= 0; col<=n; col++){
                int atEveryIndex = originalN - Math.min(Math.min(col,row), Math.min(n-row, n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
        
    }
    
}
