/* Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle
* centered at (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the
* rectangle, as shown in Figure 3.9b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less
* than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0.
* Test your program to cover all cases).
*/

import java.util.Scanner;

public class ChecksPoint {

    public static void main(String[] args) {

        // to permit write in the system.
        Scanner input = new Scanner(System.in);

        // print and ask information for the user.
        System.out.println("Enter a point with two coordinates: ");

        // declaration of variable at scanner.
        int height = input.nextInt();
        int width = input.nextInt();

        // variables to check points.
        double checkHeight = 5.0 / 2;
        double checkWidth = 10 / 2;

        // criteria of rectangle with measures.
        if (height <= checkHeight && width <= checkWidth) {
            System.out.println("Point (" + height + ", " + width + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + height + ", " + width + ") is not in the rectangle");
        }
    }
}
