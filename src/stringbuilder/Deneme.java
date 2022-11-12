package stringbuilder;

public class Deneme {
    public static void main(String[] args) {

        String str = "Java";
        str = "Super";
        System.out.println(str);

        System.out.println(str.length());
        StringBuilder sb1 =new StringBuilder();
        sb1.append("java");
        sb1.append("learn");
        System.out.println(sb1);
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb);

        String sb2= sb.toString();

        sb.append("ali");
        sb.append("Can");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
