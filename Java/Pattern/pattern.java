// pattern for N = 4, rows and columns = 4
// print start in square
// print 1 to 5 in 5 rows
//  print 1111 in row 1, 2222 in row 2 , 3333 in row 3, 4444 in row 4 pattern with n =2

public class pattern{
    public static void main(String[] args){
        System.out.println("=== DIAMOND HOLLOW ===");
        diamondHollow(4);
        
        System.out.println("\n=== BUTTERFLY ===");
        butterfly(4);
        
        System.out.println("\n=== PASCAL'S TRIANGLE ===");
        pascalTriangle(6);
        
        System.out.println("\n=== HOURGLASS ===");
        hourglass(4);
        
        System.out.println("\n=== ZIGZAG ===");
        zigzag(4);
        
        System.out.println("\n=== NUMBER SPIRAL ===");
        spiral(4);
        
        System.out.println("\n=== STAR DIAMOND ===");
        starDiamond(4);
    }
    private static void printpattern(int n){
        for(int i =1; i <= n; i++){
            for(int j =1; j <= n; j++){
                System.out.print(n);
            }
            System.out.println();

        }

    }

    private static void printstar(int m){
        for(int i =1; i<=m; i++ ){
            for(int j=1; j< m; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    // order
    private static void printorder(int m){
        for(int i =1; i<=m; i++ ){
            for(int j=1; j<=m; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    // 1-4
    private static void print1and2(int m){
        for(int i =1; i<=m; i++ ){
            for(int j=1; j<=m; j++){
                System.out.print(i);
            
            }
            System.out.println();

        }
    }

    // ==================== HARDEST PATTERNS ====================

    // 1. DIAMOND PATTERN (HOLLOW)
    // For n=4: produces a hollow diamond shape
    private static void diamondHollow(int n){
        // Upper half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print("*");
            if(i > 1){
                for(int j = 1; j < 2 * i - 2; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print("*");
            if(i > 1){
                for(int j = 1; j < 2 * i - 2; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. BUTTERFLY PATTERN
    // For n=4: creates a butterfly/hourglass effect with numbers
    private static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            // Left side
            for(int j = 1; j <= i; j++) System.out.print(j);
            // Middle spaces
            for(int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            // Right side
            for(int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            // Left side
            for(int j = 1; j <= i; j++) System.out.print(j);
            // Middle spaces
            for(int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            // Right side
            for(int j = i; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    // 3. PASCAL'S TRIANGLE
    // For n=6: produces Pascal's triangle (mathematical pattern)
    private static void pascalTriangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }
    private static int nCr(int n, int r){
        if(r == 0 || r == n) return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    // 4. HOURGLASS PATTERN (NUMBERS)
    // For n=4: creates hollow hourglass with numbers
    private static void hourglass(int n){
        // Upper half (decreasing)
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print(j);
            if(i > 1){
                for(int j = i - 1; j >= 1; j--) System.out.print(j);
            }
            System.out.println();
        }
        // Lower half (increasing)
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= n - i; j++) System.out.print(" ");
            for(int j = 1; j <= i; j++) System.out.print(j);
            if(i > 1){
                for(int j = i - 1; j >= 1; j--) System.out.print(j);
            }
            System.out.println();
        }
    }

    // 5. ZIGZAG PATTERN
    // For n=4: creates a zigzag with numbers
    private static void zigzag(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                // Odd rows: left to right
                for(int j = 1; j <= n; j++){
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                // Even rows: right to left
                num += n - 1;
                for(int j = 1; j <= n; j++){
                    System.out.print(num + " ");
                    num--;
                }
                num += n + 1;
            }
            System.out.println();
        }
    }

    // 6. NUMBER SPIRAL PATTERN
    // For n=4: creates a spiral of numbers
    private static void spiral(int n){
        int[][] arr = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while(top <= bottom && left <= right){
            // Fill top row
            for(int i = left; i <= right; i++) arr[top][i] = num++;
            top++;
            
            // Fill right column
            for(int i = top; i <= bottom; i++) arr[i][right] = num++;
            right--;
            
            // Fill bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--) arr[bottom][i] = num++;
                bottom--;
            }
            
            // Fill left column
            if(left <= right){
                for(int i = bottom; i >= top; i--) arr[i][left] = num++;
                left++;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    // 7. STAR DIAMOND WITH HOLLOW CENTER
    // For n=5: creates a large hollow diamond
    private static void starDiamond(int n){
        int size = 2 * n - 1;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int dist = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                if(dist == 0 || dist == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}


