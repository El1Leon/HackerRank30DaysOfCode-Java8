/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in); // Create a scanner object

    public static void main(String[] args)
            /* public This is the access modifier of the main method.
            // static allows the JVM can load the class into memory and call the main method
            // Java main method doesn’t return anything, that’s why it’s return type is void
            // main This is the name of java main method.
            // Java main method accepts a single argument of type String array. 
            //This is also called as java command line arguments.*/
    {
        int n = scanner.nextInt(); // nextInt() Reads a int value from the user.
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); //The function skips the input if an anchored match of the specified pattern succeeds it.
        

        int[] arr = new int[n]; // It declares a pointer to a dynamic array of type int and size n 

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) //for (statement 1; statement 2; statement 3) {
  // code block to be executed}
        {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for(int i=n-1; i>=0; i--) //for (statement 1; statement 2; statement 3) {
  // code block to be executed}
        {
            System.out.print(arr[i] + " ");
        }
        scanner.close(); //method closes this scanner.
    }
}
