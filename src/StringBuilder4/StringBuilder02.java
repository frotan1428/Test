package StringBuilder4;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize cok dikkat   ");
        sb1.append("");

        System.out.println(sb1.length());//13
        System.out.println(sb1.capacity());//16  => 2*16 +2

        System.out.println(sb1.reverse());//zinide takkid  koc ezirP
        System.out.println(sb1.reverse());//Prize cok  dikkat ediniz

        System.out.println(sb1.substring(0,5));//Prize

        System.out.println(sb1.substring(6));// cok  dikkat ediniz

        System.out.println(sb1.substring(sb1.indexOf(" ")));

        System.out.println(sb1.insert(0,"ediniz"));




    }
}
