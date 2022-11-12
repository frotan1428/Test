package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex08 {

    public static void main(String[] args) throws IOException {

        System.out.println("==============");
        printTheAge(-12);

    }
    //Create a method with throw "IllegalArgumentException" for negative ages.

    public static void printTheAge( int age) {

            if (age>=0){
                System.out.println(age);
            }else {
                throw new IllegalArgumentException("Ages cannot be Negative");
            }
    }

}
