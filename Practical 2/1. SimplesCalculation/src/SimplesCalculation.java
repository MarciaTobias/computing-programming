/* Write a program that displays the result of:
 * 9.5 x 4.5 - 2.5 x 3 / 45.5 - 3.5
 * */

public class SimplesCalculation {

    public static void main(String[] args) {

        double firstEquation = (9.5 * 4.5) - (2.5 * 3);
        double secondEquation = (45.5 - 3.5);
        double total = firstEquation / secondEquation;

        System.out.println("The result is " + total);
    }
}