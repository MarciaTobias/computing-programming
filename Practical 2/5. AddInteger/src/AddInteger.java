/* Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an
* integer is 932, the sum of all its digits is 14. */

import java.util.Scanner;

public class AddInteger {

    public static void main(String[] args) {

        //to permit input information in the system.
        Scanner input = new Scanner(System.in);

        //to ask to a user to write a number.
        System.out.println("Write a number: ");

        //declaration of variables.
        int number = input.nextInt();
        int total = 0;

        // while loop will run up to the number is bigger than 0.
        while (number > 0) {
            // it will sum the remainder of the number.
            total = total + number % 10;
            number = number / 10;
        }

        System.out.println("The sum of all digits is " + total);

    }
}
