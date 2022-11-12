package StringBuilder5;

public class Stringbuilder01 {

    public static void main(String[] args) {

        String str= "Ali Can";
        str="java cok guzel";
        System.out.println(str);//java cok guzel
        StringBuilder sb1=new StringBuilder("Ali can");//Ali can
        sb1.append("java biliyor");
        System.out.println(sb1);//Ali canjava biliyor

        StringBuffer sb2=new StringBuffer("Ali canjava biliyor");
        System.out.println(sb2);

        String st2=sb1.toString();
        System.out.println(st2);//Ali canjava biliyor


        StringBuilder sb3=new StringBuilder(str);
        System.out.println(sb3);



    }
}
