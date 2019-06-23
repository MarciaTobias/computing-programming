/* Write a program that displays the result of:
 *
 * p = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13)
 *
 * Hint: Use 1.0 instead on 1 in your program.
 *
 */

public class FractionCalculation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //declaration of variable
        double p;

        //the equation from the problem
        p = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println("The result of the equation is " + p);

    }
}
