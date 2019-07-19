/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 4
 *
 *     Write a program that prompts the user to enter the year and first day of the year, and displays the first day
 *     of each month in the year on the console. For example, if the user entered the year 2013, and 2 for Tuesday,
 *     January 1, 2013, your program should display the following output:
 *
 *      January 1, 2013 is Tuesday
 *                ...
 *     December 1, 2013 is Sunday
 *
 * */

import java.util.Scanner;

public class YearFirstDay {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        // Permits the user enter the year.
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Permits the user enter the day of the year.
        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int numberOfDaysInMonth = 0;

        // For loop goes through all months of an year.
        for (int month = 1; month <= 12; month++) {

            String firstDayString;

            switch (month) {

                // one case for each month
                case 1: System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;

                    // Call the method and store in the new variable
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 2: System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 3: System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 4: System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 5: System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 6: System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 7: System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 8: System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 9: System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 10: System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 11: System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;

                case 12: System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;
            }

            // Calculation for the first day of each month.
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }

    // Method to associate the result of the calculation above with the day od the week.
    private static String firstDay(int firstDay) {

        String firstDayString = "";

        switch (firstDay) {
            case 0: firstDayString = "Sunday"; break;
            case 1: firstDayString = "Monday"; break;
            case 2: firstDayString = "Tuesday"; break;
            case 3: firstDayString = "Wednesday"; break;
            case 4: firstDayString = "Thursday"; break;
            case 5: firstDayString = "Friday"; break;
            case 6: firstDayString = "Saturday"; break;
        }

        return firstDayString;
    }
}
