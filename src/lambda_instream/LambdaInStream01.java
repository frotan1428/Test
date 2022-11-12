package lambda_instream;

import java.util.stream.IntStream;

public class LambdaInStream01 {
    public static void main(String[] args) {
        System.out.println(getSumFrom1T025());
        System.out.println(getSumFrom1To25());
        System.out.println(getProduct());
        System.out.println(getFactorial());
        System.out.println(CalculateTheFactorial(4));
    }
    //1)Create a method to find the sum of integers from 7 to 100
    // 1way:
    public static int getSumFrom1To25(){
        //this InStream does the same actions as for loop does in Structure programing
        return   IntStream.range(1,26).reduce(0,Math::addExact);

    }
    public static int getSumFrom1T025(){
        //this InStream does the same actions as for loop does in Structure programing
        return   IntStream.rangeClosed(1,25).reduce(0,Math::addExact);

    }
    //2)Create a method to find the sum of the integers from 5 10 (inc)
    public static int getProduct(){
        return  IntStream.rangeClosed(2,4).reduce(0,Math::addExact);
    }

    //3)Create a method to calculate the factorial of a given number.(4 factorial = 1*2*3*4  ==> 4! = 1*2*3*4)
// 1way:
    public static int getFactorial(){
        return IntStream.rangeClosed(1,4).reduce(1,Math::multiplyExact);
    }

    //2 way:
    public static  Object CalculateTheFactorial(int x){

        return x>0 ? IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact): "Do not use Negative ";
    }


    }

