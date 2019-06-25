/* Write a program that displays a random uppercase letter using the System.CurrentTimeMillis() method. */

public class RandomUpperCase {

    public static void main(String[] args) {

        // current time from milliseconds.
        long currentDateTime = System.currentTimeMillis();

        // calculation to get the random upper letter.
        long randomLetter = 'A' + currentDateTime % ('Z' - 'A' + 1);

        System.out.println("The random letter is: " + (char) randomLetter + " == " + currentDateTime);
    }
}
