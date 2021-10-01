import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.print("First name: ");
        String first = scan.nextLine();
        System.out.print("Last name: ");
        String last = scan.nextLine();

        // Use the required string methods to print out the information
        System.out.println(first + " " + last);
        System.out.println(first.length() + last.length());
        System.out.println(first.substring(0,1) + last.substring(0,1));
        System.out.println(first.compareTo(last));

        int lastOfFirst = first.length() - 1;
        String lastOfFirrst = first.substring(lastOfFirst);
        System.out.println(last.indexOf(lastOfFirrst));

        int lastOfLast = last.length() - 1;
        String lastOfLasst = last.substring(lastOfLast);
        System.out.println(first.indexOf(lastOfLasst));
    }
}
