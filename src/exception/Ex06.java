package exception;

public class Ex06 {
    public static void main(String[] args) {
        /*
    Note: If Exceptions happen visible on the console after running the code, the Exceptions are called "Run Time Exceptions"
          The other name of "Run Time Exceptions" is "Unchecked Exceptions"
          Followings are "Run Time Exceptions"
          1)ArithmeticException   2)ArrayIndexOutOfBoundsException   3)NullPointerException   4)NumberFormatException
          5)StringIndexOutOfBoundsException   6)ClassCastException
     */

        Object x= 12;

        try {
            String s= (String) x;
            System.out.println(s);
        }catch (ClassCastException e){
            System.out.println("Conversion is impossible between those Data Type");
        }

    }
}
