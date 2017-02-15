import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static HashMap<String, Integer> magMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        for(int i = 0; i < magazine.length; i++){
            if(magMap.containsKey(magazine[i])){
                magMap.put(magazine[i], magMap.get(magazine[i]) + 1);
            }
            else {
                magMap.put(magazine[i], 1);
            }
        }
        for(int i = 0; i < ransom.length; i++){
            if(magMap.containsKey(ransom[i]) && magMap.get(ransom[i]) > 0){
                magMap.put(ransom[i], magMap.get(ransom[i]) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
