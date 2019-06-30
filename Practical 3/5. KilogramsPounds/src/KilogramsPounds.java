/* Write a program that displays the following table (note that 1 kilogram is 2.2 pounds). */

public class KilogramsPounds {

    public static void main(String[] args) {

        // conversion 1 kilogram is 2.2 pounds.
        final double pound = 2.2;

        // print the title of the table.
        System.out.println("Kilograms\tPounds\n");

        // loop for kilo in sequence up to 200.
        for (int kilo = 1; kilo < 200; kilo++) {

            // print the value of kilogram and conversion to pound.
            System.out.printf(kilo + "\t\t\t" + "%.1f", (kilo * pound));
            System.out.println();
        }
    }
}