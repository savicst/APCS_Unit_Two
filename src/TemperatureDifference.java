import java.util.Scanner;

public class TemperatureDifference {
    /**
     * This method will calculate the difference in two temperatures, regardless of which one is larger.
     * @param temp1 - an int temperature value
     * @param temp2 - an int temperature value
     * @return the absolute value of the difference between the two temps. Make sure to change the 0
     */
    public static int calculateDifference(int tempOne, int tempTwo) {

        return Math.abs(tempOne - tempTwo);
    }

    public static void main(String[] args) {
        // Scanner object to get input
        Scanner scan = new Scanner(System.in);

        // Get the two temperatures from the user as input
        System.out.print("Enter the first temperature: ");
        int tempOne = scan.nextInt();
        System.out.print("Enter the second temperature: ");
        int tempTwo = scan.nextInt();
        // Call the calculateDifference method and save the result in a variable.
        int difference = calculateDifference(tempOne,tempTwo);
        // Print out the information to the user
        System.out.println("The temperature changed " + difference + " degrees.");
    }
}
