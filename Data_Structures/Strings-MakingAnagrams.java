import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        
        int deleteCount = 0;
        
        int[] one = new int[26];
        int[] two = new int[26];
        
        for(int i = 0; i < first.length(); i++){

            char oneIndex = first.charAt(i);
            one[oneIndex - 'a'] += 1;
            
            // if(index >= 97 && index <= 122) - for lowercase charcters;
            // if(index >= 65 && index <= 90) - for uppercase charcters;
        }
        
        for(int i = 0; i < second.length(); i++){
            char twoIndex = second.charAt(i);
            two[twoIndex - 'a'] += 1;
        }
        
        for(int i = 0; i < 26; i++){
            if(one[i] >= two[i])
                deleteCount += (one[i] - two[i]);
            else
                deleteCount += (two[i] - one[i]);
        }
        
        return deleteCount;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}