/* Write a program that displays the current time and date, calculated from the System.CurrentTimeMillis() method. */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTimeDate {

    public static void main(String[] args) {

        // The format to display the date and time.
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");

        // Current time from milliseconds.
        long currentDateTime = System.currentTimeMillis();

        // Converting milliseconds to date.
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.setTimeInMillis(currentDateTime);

        // Print the current and date.
        System.out.println("The current date and time is: " + "\n" + formatter.format(myCalendar.getTime()));
    }
}
