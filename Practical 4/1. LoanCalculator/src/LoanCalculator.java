/**
 * Practical 4 Question 1
 *
 *      Write a program that lets the user enter the loan amount and loan period
 *      in number of years and displays the monthly and total payments for each
 *      interest rate starting from 5% to 8%, with an increment of 1/8%.
 *
 * Created by Marcia Tobias on 24/10/2018.
 * */



import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {

        // Instantiate the interest rate.
        double interestRate = 5.0;

        // Permits input data in the system.
        Scanner input = new Scanner(System.in);

        // User enter the loan and how many years.
        System.out.println("Enter the loan amount: ");
        double loan = input.nextDouble();

        System.out.println("Enter the number of years: ");
        int period = input.nextInt();

        // Print the columns of table.
        System.out.print("\nInterestRate\tMonthlyRate\t\tTotalPayment\n");

        // Conditions about the interest rate of the loan.
        for (; interestRate <= 8.0; interestRate += 1.0 / 8) {

            // How much is the rate per month.
            double monthlyRate = (interestRate / 1200);

            // Calculate the monthly payment.
            double monthlyPayment = (loan * monthlyRate) / (1 - 1 / (Math.pow(1 + monthlyRate, period * 12)));
            double finalMonthlyPayment = (monthlyPayment * 100) / 100.0;

            // Calculate the total amount of payments.
            double fullPayment = monthlyPayment * period * 12;
            double totalPayment = (fullPayment * 100) / 100.0;

            // Print the results of the table.
            System.out.printf("%.3f\t\t\t %.2f\t\t\t%.2f\n", interestRate, finalMonthlyPayment, totalPayment);
        }
    }
}
