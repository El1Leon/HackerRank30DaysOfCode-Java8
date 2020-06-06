/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package let.s.review;

import java.util.*;
/**
 *
 * @author Edwar
 */
public class LetSReview 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        int t = sc.nextInt(); // nextInt() Reads a int value from the user.
        sc.nextLine(); //nextLine() Reads a String value from the user
        for(int i=0; i<t; i++) /*for (statement 1; statement 2; statement 3) {
                                // code block to be executed}*/
        {
            String s = sc.nextLine(); //nextLine() Reads a String value from the user
            char[] charArray = s.toCharArray(); /* toCharArray() method returns an Array of chars 
            after converting a String into sequence of characters.*/
            for(int j=0; j<s.length(); j++) /*for (statement 1; statement 2; statement 3) {
                                            // code block to be executed}*/
            {
                if(j%2==0) //block of code to be executed if the condition is true
                {
                    System.out.print(charArray[j]); //is used to print an argument that is passed to it
                }
            }
            System.out.print(" "); //is used to print an argument that is passed to it
            for (int j = 0; j < charArray.length; j++) /*for (statement 1; statement 2; statement 3) {
                                                // code block to be executed}*/   
            {
                if (j % 2 != 0) //block of code to be executed if the condition is true
                {
                    System.out.print(charArray[j]); //is used to print an argument that is passed to it
                }
            }
            System.out.println(); //is used to print an argument that is passed to it
        }
    }
}
