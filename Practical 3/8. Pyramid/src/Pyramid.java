/* Using a for loop, write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, as
* shown in the following sample run:
*/

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        // to permit type in the system.
        Scanner input = new Scanner(System.in);

        // user have to choose a number from 1 to 15.
        System.out.print("Enter an integer from 1 o 15: ");
        int userLines = input.nextInt();

        // design of pyramid.
        for (int row = 1; row <= userLines; row++) {

            // create space in the rows.
            for (int space = 1; space <= userLines - row; space++) {
                System.out.printf("%3s"," ");

            }

            // create ascending numbers in the pyramid.
            for (int x = row; x >= 1; x--) {
                System.out.printf("%3d", x);

            }

            // create descending numbers in the pyramid.
            for (int x = 2; x <= row; x++) {
                System.out.printf("%3d", x);

            }

            // create new line.
            System.out.println();
        }
    }
}
