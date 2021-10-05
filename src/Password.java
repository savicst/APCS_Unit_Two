import java.util.Locale;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            //gather input
        System.out.print("First name: ");
        String FirName = scan.nextLine();
        System.out.print("Middle name: ");
        String MidName = scan.nextLine();
        System.out.print("Last name: ");
        String LasName = scan.nextLine();
        System.out.print("Age: ");
        int ageMult = scan.nextInt() * 75;
            //halfway points of each name
        int HalfFir = FirName.length() / 2;
        int HalfMid = MidName.length() / 2;
        int HalfLas = LasName.length() / 2;
            //find middle letter and make uppercase
        String MidFir = FirName.substring(HalfFir,HalfFir+1);
        String MidMid = MidName.substring(HalfMid,HalfMid+1);
        String MidLas = LasName.substring(HalfLas,HalfLas+1);
            String MidAll = MidFir + MidMid + MidLas;
            String MidAllUp = MidAll.toUpperCase();
            //find last letter of each name
        int LastFir = FirName.length()-1;
        int LastMid = MidName.length()-1;
        int LastLas = LasName.length()-1;
        String LasFir = FirName.substring(LastFir);
        String LasMid = MidName.substring(LastMid);
        String LasLas = LasName.substring(LastLas);
            String LasAll = LasFir + LasMid + LasLas;
            //Print
        System.out.println("Password: "+ MidAllUp + LasAll + ageMult);
    }
}
