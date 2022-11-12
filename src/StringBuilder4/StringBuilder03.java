package StringBuilder4;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb2= new StringBuilder("Java cok guzel");

        System.out.println(sb2.toString().toUpperCase());//JAVA COK GUZEL==> JL

        System.out.println(sb2.charAt(0) + " " +sb2.toString().charAt(sb2.length()-1));//J l

        System.out.println(sb2.replace(0,4,"QA"));//QA cok guzel

        System.out.println(sb2.delete(0,2));

        System.out.println(sb2.deleteCharAt(3));

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb3= new StringBuilder("bli Can");

        System.out.println(sb1.toString().equals(sb3.toString()));//false

        System.out.println(sb1.compareTo(sb3));//--33
        System.out.println(sb3.compareTo(sb1));//33








    }
}
