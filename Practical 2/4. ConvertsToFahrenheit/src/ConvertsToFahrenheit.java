/* Write a program that reads a Celsius degree in double from the console, then converts it to Fahrenheit and displays
 * the result. The formula for the conversion is as follows:  fahrenheit = (9 / 5) * celsius + 32
 *
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */

// library for the scanner.
import java.util.Scanner;

public class ConvertsToFahrenheit {

    public static void main(String[] args) {

        //to permit input information in the system
        Scanner input = new Scanner(System.in);

        //to ask for the user to input the data
        System.out.println("Please input the Celsius temperature: ");

        //declaration of variables
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

    }
}
