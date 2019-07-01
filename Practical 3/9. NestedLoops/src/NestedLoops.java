/* Use nested loops that display the following patterns one after another (each pattern will require entirely separate
* nested loops):
*/

public class NestedLoops {

    public static void main(String[] args) {

        // print the title of table A.
        System.out.println("Pattern A\n");

        // criteria of table with 6 rows.
        for (int row = 1; row <= 6; row++) {

            // create the numbers.
            for (int column1 = 1; column1 <= row; column1++) {

                // create space.
                System.out.print(column1 + " ");
            }
            System.out.println();
        }

        // print the title of table B.
        System.out.println("\nPattern B\n");

        // criteria of table with 6 rows.
        for (int row = 1; row <= 6; row++) {

            // create the numbers.
            for (int column1 = 1; column1 <= 7 - row; column1++) {

                // create space.
                System.out.print(column1 + " ");
            }
            // generate new line.
            System.out.println();
        }

        // print the title of table C.
        System.out.println("\nPattern C\n");

        // criteria of table with 6 rows.
        for (int row = 1; row <= 6; row++) {

            // create the numbers.
            for (int column2 = 1; column2 <= 6 - row; column2++) {

                // create space.
                System.out.print("  ");

            } for (int column1 = 1; column1 <= row; column1++) {

                // create a space.
                System.out.print(column1 + " ");
            }
            // generate a new line.
            System.out.println();
        }

        // print the title of table D.
        System.out.println("\nPattern D\n");

        // criteria of table with 6 rows.
        for (int row = 1; row <= 6; row++) {

            // create the numbers.
            for (int column2 = row; column2 > 1; column2--) {

                // create space.
                System.out.print("  ");
            }

            for (int column1 = 1; column1 <= 7 - row; column1++) {

                // create space.
                System.out.print(column1 + " ");
            }
            // generate the lines.
            System.out.println();
        }
    }
}
