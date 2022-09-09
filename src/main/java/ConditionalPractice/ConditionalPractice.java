package ConditionalPractice;


import java.util.*;
/**
 * This code contains errors that you will need to fix.
 * The goal of the code is to accept input from the user, then decide if the answer 
 * is between 0 and 10 (including both 0 and 10). If it is, it should write a message
 * stating "x is between 0 and 10.
 * If the input number is below 0 or greater than 10, for example -1 or 11, then it
 * should say "x is either less than 0 or greater than 10".
 * 
 * Note: There are no tests for this assignment. Run your code to make sure it meets
 * the requirements listed above.
*/

public class ConditionalPractice {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        x = reader.nextLine();
        if (x > 0 && x <= 10)
            System.out.println("x is between 0 and 10");
        otherwise
            System.out.println("x is either less than 0 or greater than 10");
    }
    
}
