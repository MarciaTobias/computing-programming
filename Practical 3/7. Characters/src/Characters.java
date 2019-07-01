/* Using a for loop, write a program that prints the characters in the ASCII character table from ! to ~. Display ten
* characters per line. The ASCII table is shown in the lecture slides. Characters should be separated by exactly one
* space.
*/

public class Characters {

    public static void main(String[] args) {

        // loop started in symbol ! up to ~.
        for (int symbol = '!', count = 1; symbol <= '~'; symbol++)

            // print until the division by 10 is different than 0.
            System.out.print((count++ % 10 != 0) ? (char)symbol + " " : (char)symbol + "\n");
    }
}
