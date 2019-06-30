/* The right-angle point is placed at (0, 0), and the other two points are placed at (200, 0), and (0, 100). Write a
* program that prompts the user to enter a point with x- and y-coordinates using JOptionPane and determines whether the
* point is inside the triangle. The result should also be displayed using a JOptionPane alert.
*/

import javax.swing.JOptionPane;

class Triangle {

    public static void main(String[] args) {

        // the JOption to get coordinates from user.
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the point of coordinate = X: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the point of coordinate = Y: "));

        // calculation to get the point insight of triangle.
        int convex1 = (-x * (200 * 100)) / (-y * 200 - x * 100);
        int convex2 = (-y * (200 * 100)) / (-y * 200 - x * 100);


        // conditions to check if points are insight of triangle.
        if (x < convex1 && y < convex2) {

            JOptionPane.showMessageDialog(null, "Point (" + x + ", " + y + ") is in the triangle");

        }
        else {

            JOptionPane.showMessageDialog(null, "Point (" + x + ", " + y + ") is not in the triangle");

        }
    }
}

