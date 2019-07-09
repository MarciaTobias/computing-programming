// author: marcia tobias

// Write a nested for loop that prints the following output:

public class NestedPyramid {

    public static void main(String[] args) {

        String string = " ";

        int number;

        // generate blank strings.
        for (int row = 0; row <= 7; row++) {

            for (int column = 1; column <= 7 - row; column++) {

                System.out.printf("%4s", string);
            }

            // the first 50% of numbers printed in the same line.
            for (int column = 0; column <= row; column++) {

                // calculation for exponential number.
                number = (int) Math.pow(2, column);

                System.out.printf("%4d", number);
            }

            // print the second group in the same line.
            for (int column = row - 1; column >= 0; column--) {

                // calculation of exponential number.
                number = (int) Math.pow(2, column);

                System.out.printf("%4d", number);

            }

            // generate blank lines and give the pyramid format.
            System.out.println();
        }
    }
}
