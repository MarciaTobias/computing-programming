/* Marcia Tobias - 31/10/2018.
 *
 * Practical 5 Question 1
 *
 *      Write a method with the following header to format the integer with the specified width. The method returns a
 *      string for the number with one or more prefix 0s. The size of the string is the width. For example,
 *      format(34, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer than the width, the method
 *      returns the string representation for the number. For example, format(34, 1) returns 34.
 *
 */

import java.util.Scanner;

public class FormatInteger {

    public static void main(String[] args) {

        // Permits the user input the number and the width.
        Scanner input = new Scanner(System.in);
        System.out.println("write a number: ");
        int userNumber = input.nextInt();

        System.out.println("Write the width: ");
        int userWidth = input.nextInt();

        // Print the statement, the number and width.
        System.out.println("format (" + userNumber + ", " + userWidth + ") returns " + format(userNumber, userWidth));
    }

    // Method to include the zeros imputed by the user
    public static String format (int number, int width) {

        String myNumber = number + "";

        // If the number is shorter than the width.
        if (myNumber.length() < width) {

            for (int m = width - myNumber.length(); m > 0; m--) {

                // Include zeros before the number.
                myNumber = 0 + myNumber;
            }
        }

        // Else, return the number imputed by the user
        return myNumber;
    }
}
