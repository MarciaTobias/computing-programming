/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 6
 *
 *      Write a program that simulates flipping a coin one million times and displays the number of heads and tails.
 *
 */

public class FlippingCoin {

    public static void main(String[] args) {

        // Declaration of variables.
        int heads = 0;
        int tails = 0;

        // Loop using range from 0 to one million flips.
        for (int i = 0; i <= 1000000; i++) {

            // Random method for the flips.
            int flips = (int) (Math.random() * 2);

            // If is head, it will count one more head
            if (flips == 1) {
                heads++;
            }

            // Else, it will increase the count of tails.
            else
                tails++;
        }
        // Print the random result
        System.out.printf("Flipping a coin one million times: \nHeads: %d\nTails: %d", heads, tails );
    }
}
