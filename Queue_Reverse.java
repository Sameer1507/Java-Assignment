/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue_reverse;

/**
 *
 * @author SAM
 */
import java.util.*; 

public class Queue_Reverse {

    static Queue<Integer> queue; 
  
    // Utility function to print the queue 
    static void Print() 
    { 
        while (!queue.isEmpty()) { 
            System.out.print( queue.peek() + ", "); 
            queue.remove(); 
        } 
    } 
  
      static void reversequeue() 
    { 
        Stack<Integer> stack = new Stack<>(); 
        while (!queue.isEmpty()) { 
            stack.add(queue.peek()); 
            queue.remove(); 
        } 
        while (!stack.isEmpty()) { 
            queue.add(stack.peek()); 
            stack.pop(); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        queue = new LinkedList<Integer>(); 
        queue.add(1); 
        queue.add(2); 
        queue.add(3); 
        queue.add(4); 
        queue.add(5); 
        queue.add(6); 
        queue.add(7); 
        queue.add(8); 
        queue.add(9); 
        queue.add(10); 
  
        reversequeue(); 
        Print(); 
    } 
} 
    
