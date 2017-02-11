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
        
        int maxLength = first.length();
        if(second.length() > maxLength)
            maxLength = second.length();
        
        for(int i = 0; i < maxLength; i++){

            char oneIndex = first.charAt(i);
            char twoIndex = second.charAt(i);
            
            // if(oneIndex >= 97 && oneIndex <= 122) - for lowercase charcters;
            // if(oneIndex >= 65 && oneIndex <= 90) - for uppercase charcters;
            
            one[oneIndex - 'a'] += 1;
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