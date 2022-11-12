package StringBuilder1;

public class StringBuilder04 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("ali Can");
        System.out.println(sb1.compareTo(sb2));//0

        System.out.println(sb1.compareTo(sb2));//32

        System.out.println(sb2.compareTo(sb1));//-32

        System.out.println(sb1.compareTo(sb1));//0

        System.out.println(sb1.toString().equals(sb2.toString()));//true--->false

    }
}
