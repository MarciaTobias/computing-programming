/* Use a while loop to find the largest integer n such that n3 is less than 12,000. */

public class LargestInteger {

    public static void main(String[] args) {

        // initialize the number with 0.
        int number = 0;

        // loop to fiend the largest number with math pow.
        while (Math.pow(number + 1, 3) < 12000) {
            number++;
        }
        // print the value found.
        System.out.println("The largest integer is " + number);
    }
}
