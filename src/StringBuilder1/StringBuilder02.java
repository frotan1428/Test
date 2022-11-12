package StringBuilder1;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb2= new StringBuilder("Java cok guzel"); // 2*c +2
        System.out.println(sb2.length());//14
        System.out.println(sb2.capacity());//30
        StringBuilder sb3= new StringBuilder(10);

        sb3.append("java zor bir program degil java zor bir program degil");
        System.out.println(sb3.length());//26
        System.out.println(sb3.capacity());//53

        System.out.println(sb2.indexOf("J"));

        System.out.println(sb2.lastIndexOf("a"));//java zor bir program degil

        System.out.println(sb2.toString().toUpperCase());//JAVA COK GUZEL
        System.out.println(sb2.toString().charAt(0));
        //Java cok guzel; ne guzel

        System.out.println(sb2.replace(0,7,"ne guzel"));//ne guzelk guzel

        System.out.println(sb2.delete(0,2));//guzelk guzel

        System.out.println(sb2.deleteCharAt(4));// guzlk guzel













    }
}
