/* Marcia Tobias on 24/10/2018.
 *
 * Practical 4 Question 9
 *
 *      This method prints the characters between ch1 and ch2 with the specified numbers per line. Write a test program
 *      that prints ten characters per line from 1 to Z. Characters are separated by exactly one space.
 *
 */

public class PrintChars {

    public static void main(String[] args) {

        // Method with parameters from 1 to z, print 10 characters per line.
        printCharacters ('1', 'Z', 10);
    }

    // Method to print characters per line
    public static void printCharacters(char myChar1, char myChar2, int numberLine) {

        int numberPrinted = 0;

        // Loop to pass for the characters.
        for (; myChar1 <= myChar2; myChar1++) {

            // Print every char in sequence and increase the counter.
            System.out.print(myChar1 + " ");
            numberPrinted++;

            if (numberPrinted % numberLine == 0) {

                // It will create a new line , after print the 10 character in the line.
                System.out.println();
            }
        }
    }
}
