package StringBuilder1;

public class Stringbuilder03 {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat "); //Prize dikkat edin
        System.out.println(sb1);//Prize dikkat edin
        System.out.println(sb1.insert(12," edin"));//Prize dikkat edin

        System.out.println(sb1.reverse());//nide takkid ezirP
        System.out.println(sb1.reverse());//Prize dikkat edin ==>

        System.out.println(sb1.substring(0,5));//Prize
        System.out.println(sb1.substring(5));// dikkat edin


        StringBuilder sb2=new StringBuilder("        Prize dikkat     ");
        System.out.println(sb2.length());//27
        System.out.println(sb2.capacity());//43

        sb2.trimToSize();
        System.out.println(sb2.length());//27
        System.out.println(sb2.capacity());//27






    }
}
