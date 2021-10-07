import java.util.Scanner;
public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the description of this course? ");
        String str = scan.nextLine();
        int firSpace = str.indexOf(" ");
        System.out.println("Department: "+ str.substring(0,firSpace));
        int secSpace = str.indexOf(" ", firSpace+1);
        System.out.println("Course Number: " + str.substring(firSpace+1, secSpace));
        System.out.println("Title: " + str.substring(secSpace));
    }
}
