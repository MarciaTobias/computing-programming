/**
 * Practical 4 Question 2
 *
 *      Write a program that lets the user enter the loan amount and loan period
 *      in number of years and displays the monthly and total payments for each
 *      interest rate starting from 5% to 8%, with an increment of 1/8%.
 *
 * Created by Marcia Tobias on 23/10/2018.
 * */

public class LeapYears {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //declaration of the counter
        int count = 0;

        //the range of years from 2001 to 2100
        for (int myYear = 2001; myYear <= 2100; myYear++) {

            //calculation to get the leap year
            if ((myYear % 4 == 0 && myYear % 100 !=0) || (myYear % 400 == 0)) {

                count++;

                //print the leap years ten per line
                System.out.print(myYear + (count % 10 == 0 ? "\n" : " "));
            }
        }
    }
}
