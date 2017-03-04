import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        
        // O(nlogn) time
        int flag = 0;
        if (a.length == 1) {
            System.out.println(a[0]);
        } else {
            Arrays.sort(a);
            for (int i = 0; i < n-2; i += 2) {
                flag = a[i] ^ a[i+1];
                if (flag != 0) {
                    System.out.println(a[i]);
                    return;
                }
            }
            System.out.println(a[n-1]);
        }
    }
}

// simpler solution with O(n) time and O(1) space
// from Rodney's HackerRank Solutions
// using XOR operator

//    int val = 0;
//    for (int i : a) {
//        val = val ^ i;
//    }
//    System.out.println(val);
