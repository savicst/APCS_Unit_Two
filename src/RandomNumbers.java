public class RandomNumbers {

    // create a static method called getRandom() that does not take any parameters and returns an int
    // between 0 and 37 inclusive.
 public static int getRandom(){
     int num = (int)(Math.random()*37);
     return num;
 }



    // Write a main method that calls the getRandom() function five times and prints the result. Make sure to
    // uncomment the RandomNumbersTest when ready to test your code.
    public static void main (String[] args) {


        int num1 = getRandom();
        System.out.println(num1);
        int num2 = getRandom();
        System.out.println(num2);
        int num3 = getRandom();
        System.out.println(num3);
        int num4 = getRandom();
        System.out.println(num4);
        int num5 = getRandom();
        System.out.println(num5);
    }

}
