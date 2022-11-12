package lambda_instream;

import java.util.stream.IntStream;

public class LambdaInStream03 {
    public static void main(String[] args) {

        System.out.println(products(3,7));

        printFirstTenOddNumber(80);
        printFirstTenNumber(30);




    }

    // S8:  find the product of odd numbers between 3 and 7 (inclusive)
    public static double products(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(Methods::odd).reduce(1, (x, y) -> x * y);
    }

    //S9:  print the first 10 elements of positive odd numbers
    public static void printFirstTenOddNumber(int a) {
          IntStream.rangeClosed(1,a).limit(10).
                 filter(Methods::odd).forEach(Methods ::writeInteger);
    }

    //S10:  print the first 10 elements of positive odd numbers
    public static void printFirstTenNumber(int a) {
        System.out.println();
//         IntStream.rangeClosed(1,a).limit(10).
//         forEach(Methods ::writeInteger);

        IntStream.iterate(1, t -> t + 1).limit(10).
                forEach(Methods::writeInteger);
    }



}
