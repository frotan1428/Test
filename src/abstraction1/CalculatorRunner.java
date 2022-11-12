package abstraction1;

public class CalculatorRunner {

    public static void main(String[] args) {
        int n=12;
        Calculator cal1= new Loss();
        System.out.println(cal1.subtraction(n,2));//10
        System.out.println(cal1.division(100,25));//4

        Calculator cal2= new profit();
        System.out.println(cal2.multiplication(12,2));//24
        System.out.println(cal2.addition(12,12));//24

        System.out.println(cal2.division(12,5));//-1


    }
}
