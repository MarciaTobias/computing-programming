/* Build upon your answer to Q3 (saved in a file called “CalculateCircleUserInput.java”) to ask the user to supply the
* value for the circle. The output should look like (user’s input in Red):
*
* Please input the circle’s radius: 5
* You have defined the circle's radius as 5.0
* I'ts area is 78.53982
* I'ts circumference is 31.4159
*
* Note: In order to use the “Scanner” class described in the lecture you will first have to import it using the
* following line as the first line in your program (line 1; insert the line before “public class
* CalculateCircleUserInput”:
*
* import java.util.Scanner;
*/

import java.util.Scanner;

public class CalculateCircleUserInput {

    public static void main(String[] args) {

        // Scanner to read the input from user.
        Scanner input = new Scanner(System.in);

        System.out.println("Write the radius of an circle ");

        // to store the input in a variable.
        double radius = input.nextDouble();

        // We use the Math.PI static field to get the value of PI in Java.
        double area = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * (radius);

        // printing results.
        System.out.println("The circle has a radius of " + radius);
        // Using formatting floating point numbers with printf.
        System.out.printf("It's area is %8.5f", area);
        System.out.println();
        // Using formatting floating point numbers with printf.
        System.out.printf("It's circumference is  %7.4f", circumference);
    }
}
