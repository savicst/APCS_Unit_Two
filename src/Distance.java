import java.util.Scanner;
public class Distance {

    // create the distance method below. See the instructions for the signature of the method.
    public static double distance(int x1, int y1, int x2, int y2){

     // remember to make something into a double to not lose accuracy in integer division
        double xPart = Math.pow((x2-x1), 2.0);
        double yPart = Math.pow((y2-y1), 2.0);
        double distance = Math.sqrt((xPart+ yPart));
        return distance;
    }

    // Create your main method below. It will get the input (you will need a Scanner), call the distance
    // method, and then print the results
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = scan.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        int y1= scan.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = scan.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = scan.nextInt();

        double finalDistance = distance(x1,y1,x2,y2);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + finalDistance);
    }

}
