package Java.BinarySearch;
// Find Smallest Letter Greater Than Target
public class L744 {
    public static void main(String[] args) {
        // You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
        // Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
        char [] arr = {'a','b', 'c', 'd', 'e'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));


    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        if(target >letters[letters.length -1]){
            return letters[start];
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target >= letters[mid]){
                start = mid+ 1;
            }else{
                end = mid-1;
            }
        }
        return letters[start % letters.length];   // because if target is greater than the given array aur out of array then start will go out of index so to return first value we modolus it with its length
        
    }
    
}
