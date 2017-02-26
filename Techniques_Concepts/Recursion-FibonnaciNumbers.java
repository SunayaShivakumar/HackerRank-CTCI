import java.util.*;

public class Solution {

    
    public static int fibonacci(int n) {
        // recursive solution O(2^n) time O(n) space
        // if (n == 0)
        //     return 0;
        // else if (n == 1)
        //     return 1;
        // return (fibonacci(n-1) + fibonacci(n-2));
        
        // iterative solution O(n) time O(1) space - <3
        int prevPrev = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int curr = prev + prevPrev;
            prevPrev = prev;
            prev = curr;
        }
        return prevPrev;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
