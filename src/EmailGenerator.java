import java.util.Scanner;
public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first and last name: ");
        String fullName = scan.nextLine();
        String user = makeUserName(fullName);
        System.out.println("Enter your email provider (ie. ssfs.org):  ");
        String provider = scan.nextLine();
        String email = makeEmail(user,provider);
        System.out.println("New email address: " + email);
    }
    public static String makeUserName(String name){
        String initial = name.substring(0,1);
        String initial2 = initial.toLowerCase();
        int space = name.indexOf(" ");
        String last = name.substring(space+1);
        String last2 = last.toLowerCase();
        int num = (int) (Math.random()*90)+ 10;
        return initial2 + last2 + num;

        }
    public static String makeEmail(String user, String provider){
        return user + "@" + provider;
        }




}
