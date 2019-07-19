/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 9
 *
 *      The formula for the conversion is:
 *      meter = 0.305 * foot
 *      foot = 3.279 * meter
 *      Write a test program that invokes these methods to display the following tables:
 *
 */

public class Conversion {

    // Method that coverts foot to meters.
    public static double footMeter (double feet) {
        return 0.305 * feet;

    }

    // Method that coverts meters to foot.
    public static double meterFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {

        // Print the title of the table.
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("------------------------------------------");

        // For loop to display the table, using the methods above.
        for (double myFeet = 1.0, myMeters = 20.0; myFeet <= 10.0; myFeet++, myMeters += 5) {

            System.out.printf("%-4.1f     ", myFeet);
            System.out.printf("%6.3f", footMeter(myFeet));
            System.out.printf("     |     ");
            System.out.print(myMeters);
            System.out.printf("%11.3f\n", meterFoot(myMeters));
        }
    }
}
