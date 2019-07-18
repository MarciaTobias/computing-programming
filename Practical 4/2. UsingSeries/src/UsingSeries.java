/**
 * Practical 4 Question 2
 *
 *      Write a program that lets the user enter the loan amount and loan period
 *      in number of years and displays the monthly and total payments for each
 *      interest rate starting from 5% to 8%, with an increment of 1/8%.
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
