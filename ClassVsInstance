import java.io.*;
import java.util.*;

public class Person {
    private int age;
  
public Person(int initialAge) {
          // Add some more code to run some checks on initialAge
        if (initialAge < 0){
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
            
        }else{
            age = initialAge;
        }
        
    }

    public void amIOld() {
          // Write code determining if this person's age is old and print the correct statement:
        //System.out.println(/*Insert correct print statement here*/);
        if (age < 13) {System.out.println("You are young.");}
        else if (age >= 13 && age < 18) {System.out.println("You are a teenager.");}
        else {System.out.println("You are old.");}
    }

    public void yearPasses() {
          // Increment this person's age.
        age ++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        int T = sc.nextInt(); // nextInt() Reads a int value from the user.
        for (int i = 0; i < T; i++) /*for (statement 1; statement 2; statement 3) {
  // code block to be executed}*/
        {
            int age = sc.nextInt(); // nextInt() Reads a int value from the user.
            Person p = new Person(age); //The Java new keyword is used to create an instance(specific object of a specific type) of the class
            p.amIOld(); 
            for (int j = 0; j < 3; j++) /*for (statement 1; statement 2; statement 3) {
  // code block to be executed
 }*/
            {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println(); //is used to print an argument that is passed to it
        }
        sc.close(); // method closes this scanner
    }
}
