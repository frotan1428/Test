package stringbuilder2;

public class StringBuilder01 {

    public static void main(String[] args) {

        String str= "Ali Can";
        str="java biliyor";
        System.out.println(str);//java biliyor

        StringBuilder sb1= new StringBuilder("Java cok guzel");//Java cok guzel
        sb1.append(" program");
        System.out.println(sb1);//Java cok guzelprogram

         sb1.append("java ").append("cok").append("zordur");// method chain

        StringBuffer sb2= new StringBuffer("Java cok zor degil");//Java cok zor degil
        System.out.println(sb2);

        String st1=sb1.toString();
        System.out.println(st1);//Java cok guzel programjava cokzordur

        StringBuilder sb3= new StringBuilder(st1);
        System.out.println(sb3);//Java cok guzel programjava cokzordur



    }
}
