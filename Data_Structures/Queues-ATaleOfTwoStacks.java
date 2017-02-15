import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    
    public static class MyQueue<E> {
        private Stack<E> one = new Stack<E>();
        private Stack<E> two = new Stack<E>();
        
        public void enqueue(E myVar){
            one.push(myVar);
        }
        
        public E dequeue() {
            if (!two.empty()) {
                return two.pop();
            } else if (!one.empty()) {
                while (!one.empty()) {
                    two.push(one.pop());
                }
                return two.pop();
            } else {
                return null;
            }
        }
        
        public E peek() {
            if (!two.empty()) {
                return two.peek();
            } else if (!one.empty()) {
                while (!one.empty()) {
                    two.push(one.pop());
                }
                return two.peek();
            } else {
                return null;
            }
        }
    }
}