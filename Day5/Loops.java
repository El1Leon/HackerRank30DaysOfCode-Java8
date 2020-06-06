/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author Edwar
 */

public class Loops //class is the template or blueprint
{
    
    
     public static void main(String[] args) //This is the main method
     {
         
            Scanner in = new Scanner(System.in); //Created a scanner object
            int n = in.nextInt(); //Read user input
            for(int i=1;i<=10;i++)  //for (statement 1; statement 2; statement 3) {
  // code block to be executed}
            {
                System.out.println(n+" x "+i+" = "+(n*i)); //Output user input
            }
            in.close(); //method closes this scanner.
        }

}
