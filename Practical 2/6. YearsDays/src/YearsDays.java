import java.util.Scanner;

public class YearsDays {

    public static void main(String[] args) {

        //to permit input information in the system
        Scanner input = new Scanner(System.in);

        //user input the minutes
        System.out.println("Write the minutes to be convert for years and days: ");

        //declaration of variables
        int minutes = input.nextInt();
        int myYear = minutes / 525600;
        int myDay = minutes / 1440;

        //remaining minutes
        //int remainingMyMinutes = myDay % 525600;

        //print the conversion
        System.out.println(minutes + " are equal to " + myYear + " year(s) and " + myDay + " day(s)");

    }
}
