import javax.xml.stream.Location;
import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        // Create a scanner object to be able to get input from the user
        Scanner scan = new Scanner(System.in);

        // Get input for x, y, width, and height. Create four separate variables for these.
        System.out.print("X: ");
        int xVal = scan.nextInt();
        System.out.print("Y: ");
        int yVal = scan.nextInt();
        System.out.print("Width: ");
        int widthVal = scan.nextInt();
        System.out.print("Height: ");
        int heightVal = scan.nextInt();

        // Create a Rectangle object using the four pieces of user input.
        Rectangle rex = new Rectangle(xVal, yVal, widthVal, heightVal);

        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        double perimeter = 2 * rex.getWidth() + 2 * rex.getHeight();
        System.out.println("Perimeter = " + perimeter);

        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.
        double newx = -4 + rex.getX();
        double newy = -2 + rex.getY();
        rex.setLocation((int) newx, (int) newy);
        System.out.println("New location is (" + rex.getX() + ", " + rex.getY() + ")" );
    }
}
