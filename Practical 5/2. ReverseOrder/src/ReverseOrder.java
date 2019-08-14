/* Marcia Tobias - 31/10/2018.
 *
 * Practical 5 Question 2
 *
 *      Write a program that reads ten integers, stores them in an array and displays them in the reverse of the order
 *      in which they were supplied.
 *
 */

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        // Declaration of variables used to reverse.
        int m, n, temp;

        // Declaration of array and size.
        int array[] = new int [10];

        // Permits the user input data.
        Scanner input = new Scanner(System.in);
        System.out.print("Write ten numbers: ");

        // Loop to store those numbers in the array.
        for (n = 0; n < 10; n++) {

            array[n] = input.nextInt();
        }

        m = n - 1;
        n = 0;

        // While loop to reverse the numbers
        while (n < m) {

            temp = array[n];
            array[n] = array[m];
            array[m] = temp;
            n++;
            m--;
        }

        // Print the numbers reversed.
        System.out.print("The reverse order is ");

        // Space between numbers.
        for (n = 0; n < 10; n++) {
            System.out.print(array[n] + " ");
        }
    }
}
