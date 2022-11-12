package lambda_instream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LambdaInStream02 {
    public static void main(String[] args) {

        print1UpTo30(30);
        printNumber1to30(30);
        System.out.println(total(2,3));//

        System.out.println( findAverage(30,40));
        System.out.println(dividedBy8(2,14));
        printNumberDividedBy3and6(325,468);
        System.out.println(printSumNumberDividedBy8(2,16));

    }

    // S1: print the  numbers from 1 to 30 (30 not including ) as 1 2 3 .... (without for loop)
    //range(int startInclusive, int endExclusive)
    public static void print1UpTo30(int a) {
        IntStream.range(1, a).
                forEach(t -> System.out.print(t + " "));
    }

  // S2: print the  numbers from 1 to 30 (30  including ) as 1 2 3 .... (without for loop)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void printNumber1to30(int a) {
        System.out.println();
        IntStream.rangeClosed(1, a).
                forEach(t -> System.out.print(t + " "));
    }

    //S3 write code to add the numbers between (inclusive) two desired values

    public static int total(int start, int end) {
        System.out.println();
//        return IntStream.rangeClosed(start, end).sum();
         return IntStream.rangeClosed(start,end+1).sum();
    }

    //S4: find the average of numbers between 30 and 40 (inclusive)
    public static OptionalDouble findAverage(int start, int end) {
        return IntStream.rangeClosed(start, end).average();
    }

    //S5:How many numbers are there between 30 and 90 that can be divided by 8?
    public static long dividedBy8(int start, int end) {
        return IntStream.rangeClosed(start, end).
                filter(t -> t % 8 == 0).count();
    }

    //S6:  print the numbers between 20 and 40 that are divided by 3 and 6
    public static void printNumberDividedBy3and6(int start, int end) {
        IntStream.rangeClosed(start, end).
                filter(t -> t % 3 == 0 && t%6==0).forEach(t -> System.out.print(t + " "));
    }

    // S7:find the sum of the numbers that are divided by 8 between 2 and 32
    public static int printSumNumberDividedBy8(int start, int end) {
        System.out.println();
        return IntStream.rangeClosed(start, end).
                filter(t -> t % 8 == 0).sum();
    }











}
