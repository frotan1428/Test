package exception;

public class Ex01 {

    public static void main(String[] args) {

        Divied(12,1);//2
        Divied(0,5);//0
        Divied(122,1);
        System.out.println("hi");
    }

    public static void Divied(int a,int b){
        try {
            System.out.println(a/b);

        }catch (ArithmeticException e) {
            System.err.println("Sorry you can not diveded a number by zero " + e.getMessage());
        }
    }
}
