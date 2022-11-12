package StringBuilder5;

public class StringBuilder03 {
    public static void main(String[] args) {


        StringBuilder sb2= new StringBuilder("Java cok guzel");//QA
        System.out.println(sb2.toString().toUpperCase());//JAVA COK GUZEL

        System.out.println(sb2.charAt(0)+ "-" + sb2.charAt(sb2.length()-1));//J-l

        System.out.println(sb2.replace(0,4,"QA"));//QA cok guzel

       // System.out.println(sb2.replace(0,2,""));// cok guzel

        System.out.println(sb2.deleteCharAt(1));
        System.out.println(sb2.delete(0,2));//cok guzel

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb3= new StringBuilder("ali Can");
        System.out.println(sb1.toString().equals(sb3.toString()));//false

        System.out.println(sb3.compareTo(sb1));//-32== 32


    }
}
