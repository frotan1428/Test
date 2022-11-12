package stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();

        sb1.append("");//Funda java
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());// 2*c +2;


        //ex : java// html// css// / same line.

        sb1.append("java java");//java java => ava java
        System.out.println(sb1);
        System.out.println(sb1.indexOf("J"));//0
        System.out.println(sb1.lastIndexOf("a"));

//        System.out.println(sb1.substring(4));// java
//        System.out.println(sb1.substring(1,3));


        String newString =sb1.toString();

        System.out.println(newString);

        StringBuilder sb2= new StringBuilder(newString);
        System.out.println(sb2);









































    }
}
