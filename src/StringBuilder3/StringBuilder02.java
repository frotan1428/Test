package StringBuilder3;

public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb2= new StringBuilder("java cok guzel");
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//  34  16  //2 *16 +2==>34*2+2;

        System.out.println(sb2.charAt(0) + " "+ sb2.charAt(sb2.length()-1));// j l

        String str= sb2.toString();
        System.out.println(str);//java cok guzel

        StringBuilder sb3= new StringBuilder(str);
        System.out.println(sb3);//java cok guzel
        StringBuffer sb4= new StringBuffer(str);
        System.out.println(sb4);//java cok guzel

        System.out.println(sb4.indexOf("j"));//0
        System.out.println(sb4.indexOf("QA"));//-1

        System.out.println(sb4.toString().toUpperCase());//JAVA COK GUZEL;

        System.out.println(sb4.delete(0,4));//cok guzel

        System.out.println(sb4.deleteCharAt(2));// ck guzel


    }
}
