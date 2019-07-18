/**
 * Practical 4 Question 2
 *
 *      You can approximate π by using the following series:
 *      Write a program that displays the π value for i = 10,000, 20,000, ..., to 100,000.
 *
 * Created by Marcia Tobias on 22/10/2018.
 * */

public class UsingSeries {

    public static void main(String[] args) {

        // Declaration of variable pi.
        double pi;

        System.out.print("Result is: \n");

        // Condition of the problem to multiple from 10,000 to 100,000.
        for (int i = 10000; i <= 100000; i += 10000) {

            // Nest to increase the number of multiplication.
            double total = 0;

            for (int j = 1; j<= i; j++) {

                // Formula to
                total += (Math.pow(-1, j + 1) / (2 * j - 1));
            }

            // Formula to get pi.
            pi = 4 * total;

            // Print i and pi.
            System.out.println( + i + " * Pi = " + pi);
        }
    }
}
