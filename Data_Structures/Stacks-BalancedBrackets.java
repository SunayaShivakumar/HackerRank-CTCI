import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> myStack = new Stack<>();
        
        for (int j = 0; j < expression.length(); j++) {
            char i = expression.charAt(j);
            if (i == '(' || i == '{' || i == '[') {
                myStack.push(i);
            } else {
                if (myStack.empty()) {
                    return false;
                } else if ((myStack.peek() == '(' && i == ')') || 
                           (myStack.peek() == '{' && i == '}') || 
                           (myStack.peek() == '[' && i == ']')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}