/* Using suitable variables, write a Java program called “CalculateCircle.java” capable of writing out to the
* console the area (πr2) and circumference of a circle (2πr). You should include a final variable for pi (it’s a
* constant), and a variable for the radius of the circle. The output of the program should look like:
*
* The circle has a radius of 5
* I'ts area is 78.53982
* I'ts circumference is 31.4159
*/

public class CalculateCircle {

    public static void main(String[] args) {

        // declaration of variables.
        double radius = 5;
        // We use the Math.PI static field to get the value of PI in Java.
        double area = Math.PI * (radius * radius);
        double circumference = 2 * Math.PI * (radius);


        // printing results.
        System.out.println("The circle has a radius of " + radius);
        // Using formatting floating point numbers with printf.
        System.out.printf("It's area is %8.5f", area);
        System.out.println();
        // Using formatting floating point numbers with printf.
        System.out.printf("It's circumference is  %7.4f", circumference);
    }
}
