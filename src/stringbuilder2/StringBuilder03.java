package stringbuilder2;

public class StringBuilder03 {
    public static void main(String[] args) {
        
        StringBuilder sb2= new StringBuilder("Java cok guzel");

        System.out.println(sb2.toString().toUpperCase());//JAVA COK GUZEL

        System.out.println(sb2.toString().charAt(0) +" "+ sb2.toString().charAt(sb2.length()-1));//J l

        System.out.println(sb2.replace(0,4,"QA"));//QA cok guzel
        System.out.println(sb2.indexOf("Q"));
        System.out.println(sb2.lastIndexOf("cok"));//3
        System.out.println(sb2.delete(0,2));//cok guzel

        System.out.println(sb2.deleteCharAt(4));//cokguzel

    }
}
