public class WrappersDelight {

    // Create a main class and follow the instructions on the Lab sheet to complete this assignment.
    public static void main(String[] args){
        int num1 = 14;
        Integer num2 = new Integer(8);
        double num3 = 2.5;
        Double num4 = 8+ 2.5;
        num2 -=3;
        num3 = num1+num2+num4;
        num1 = num2+ (int) num4.doubleValue();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }

    // When finished, uncomment the WrappersDelight.main(null) line in the
    // test file to make sure your program is correct.

}
