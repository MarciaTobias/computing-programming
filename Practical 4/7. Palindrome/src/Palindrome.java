/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 7
 *
 *      Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as
 *      itself. Write a test program that prompts the user to enter an integer and reports whether the integer is a
 *      palindrome.
 *
 */

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        // Permits the user input an integer number.
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number with 3 digits: ");
        int myNumber = input.nextInt();

        // Print the information if the number is palindrome or not.
        System.out.println("The number " + myNumber + (isPalindrome(myNumber) ? " is " : " is not ")
                + "a palindrome number");

    }

    // Method that invoke the boolean options, if the number is palindrome according to the method reverse.
    public static boolean isPalindrome (int number){

        return number == reverse(number) ? true : false;
    }

    // Method with the criteria to check if the number is palindrome.
    public static int reverse (int number) {

        int total = 0;
        int remainder;

        while (number > 0) {

            remainder = number % 10;
            number = number / 10;
            total = total * 10 + remainder;

        }

        return total;
    }
}
