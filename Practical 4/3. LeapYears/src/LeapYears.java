/**
 * Practical 4 Question 3
 *
 *      Write a program that displays all the leap years,
 *      ten per line, in the twenty-first century (from 2001 to 2100),
 *      separated by exactly one space.
 *
 * Created by Marcia Tobias on 23/10/2018.
 * */

public class LeapYears {

    public static void main(String[] args) {

        // Declaration of the counter.
        int count = 0;

        // Print the title of the table.
        System.out.println("\n\t\t** Leap Years from 2001 to 2100 **\n");

        // The range of years from 2001 to 2100.
        for (int myYear = 2001; myYear <= 2100; myYear++) {

            // Calculation to get the leap year.
            if ((myYear % 4 == 0 && myYear % 100 !=0) || (myYear % 400 == 0)) {

                count++;

                // Print the leap years ten per line.
                System.out.print(myYear + (count % 10 == 0 ? "\n" : " "));
            }
        }
    }
}
