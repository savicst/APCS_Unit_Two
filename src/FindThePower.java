import java.util.Scanner;

public class FindThePower {

    // create a main method below and follow the given requirements carefully.
    public static int findThePower(int base, int exponent) {

        return (int)Math.pow(base,exponent);
    }
    // Remember to create a Scanner object in order to get input from the user.
    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();
        int power = findThePower(base, exp);
        System.out.println(base + "^" + exp + " = " + power);
    }

    // You will need to uncomment the FindThePower test in order to get it to run.
}
