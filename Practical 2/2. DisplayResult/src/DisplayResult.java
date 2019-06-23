/* Write a program that displays the result of
* 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
*/

public class DisplayResult {

    public static void main(String[] args) {

        //declaration and initialization of array
        int sumTuple[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //to fiend some array elements
        int total = 0;

        //the total of the list
        for (int i: sumTuple)
            total += i;
        System.out.println ("The sum of the numbers from 0 to 9 is " + (total));
    }
}
