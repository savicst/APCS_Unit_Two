import java.util.Scanner;
public class Distance {

    // create the distance method below. See the instructions for the signature of the method.
    public static double distance(int x1, int y1, int x2, int y2){

     // remember to make something into a double to not lose accuracy in integer division
        double oanfr Math.pow((x2-x1), 2);
        return
    }

    // Create your main method below. It will get the input (you will need a Scanner), call the distance
    // method, and then print the results
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("X1: ");
        int x1 = scan.nextInt();
        System.out.print("Y1: ");
        int y1= scan.nextInt();
        System.out.print("X2: ");
        int x2 = scan.nextInt();
        System.out.print("Y2: ");
        int y2 = scan.nextInt();

    }

}
