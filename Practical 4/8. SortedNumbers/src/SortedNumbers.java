/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 8
 *
 *      Write a method with the following header to display three numbers in increasing order. Also, Write a test
 *      program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 *
 */

import java.util.Scanner;

public class SortedNumbers {

    public static void main(String[] args) {

        // Permits the user input data.
        Scanner input = new Scanner(System.in);

        // Ask for the user to write 3 numbers.
        System.out.print("Write 3 random numbers: ");

        // Declaration of variables.
        double myNumber1 = input.nextDouble();
        double myNumber2 = input.nextDouble();
        double myNumber3 = input.nextDouble();

        // Call the method Display Sorted Numbers.
        displaySortedNumbers(myNumber1, myNumber2, myNumber3);
    }

    // Method to put numbers in increasing order.
    public static void displaySortedNumbers(double number1, double number2, double number3) {

        // Declaration of temporary variable.
        double tempNumber;

        // Criteria to check if the numbers are in order, if is not will put in order using temporary memory (Swap).
        if (number3 < number1 && number3 < number2) {

            tempNumber = number1;
            number1 = number3;
            number3 = tempNumber;
        }

        // Criteria to check if the numbers are in order, if is not will put in order using temporary memory (Swap).
        else if (number2 < number1 && number2 < number3) {

            tempNumber = number1;
            number1 = number2;
            number2 = tempNumber;
        }

        // Criteria to check if the numbers are in order, if is not will put in order using temporary memory (Swap).
        if (number3 < number2) {

            tempNumber = number2;
            number2 = number3;
            number3 = tempNumber;
        }

        // Print the numbers in increasing order.
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
