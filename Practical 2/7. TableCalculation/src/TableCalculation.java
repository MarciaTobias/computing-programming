/* Write a program that displays the following table (Notice the alignment of the columns):
*
* a	    b 	pow(a, b)
* 1     2	1
* 2     3	8
 * 3 	4 	81
* 4     5   1024
* 5   	6   15625
*
*/

public class TableCalculation {

    public static void main(String[] args) {

        // print the title of the table.
        System.out.println("a   " + "b   " + "pow(a, b)");
        System.out.println();

        // intialize the variable.
        int b = 2;

        // for loop to generate the results.
        for (int a = 1; a < 6 ; a++) {

            // store the calculation to a variable.
            int pow = (int) Math.pow(a, b);

            // print the results.
            System.out.println(a + "   " + b + "   " + pow);
            b++;
        }
    }
}
